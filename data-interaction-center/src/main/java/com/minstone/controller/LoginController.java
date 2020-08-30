package com.minstone.controller;


import com.alibaba.fastjson.JSONObject;
import com.minstone.config.JwtConfig;
import com.minstone.entity.vo.UserInfoVo;
import com.minstone.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Description:
 * @Author: HuangPeiDong
 * @Date: 2020/8/28 13:51
 * @Param:
 * @Return:
 **/
@RestController
@Slf4j
@RequestMapping("/login")
@Api(tags = "用户登录相关接口")
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    @Resource
    private JwtConfig jwtConfig;

    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "用户名", required = true),
            @ApiImplicitParam(name = "password", value = "密码", required = true)})
    @PostMapping
    public JSONObject login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        UserInfoVo result = userInfoService.findByUserNameAndPassword(userName, password);
        JSONObject json = new JSONObject();
        if (result != null) {
            String token = jwtConfig.createToken(result.getUserName());
            json.put("token", token);
            json.put("data", result);
            json.put("message", "登录成功");
            log.info(userName + " 登录成功");
        } else {
            json.put("token", "");
            json.put("data", "");
            json.put("message", "登录失败");
            log.info(userName + " 登录失败");
        }

        return json;
    }


}