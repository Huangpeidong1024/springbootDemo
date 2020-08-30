package com.minstone.controller;

import com.github.pagehelper.PageInfo;
import com.minstone.dto.ResponseDto;
import com.minstone.entity.vo.UserInfoVo;
import com.minstone.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:
 * @Author: HuangPeiDong
 * @Date: 2020/8/30 10:44
 **/
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping
    public ResponseDto<PageInfo<UserInfoVo>> findUserInfoList(@RequestParam(defaultValue = "1", required = true) Integer pageNum,
                                                              @RequestParam(defaultValue = "5", required = true) Integer pageSize) {
        PageInfo<UserInfoVo> userInfos = userInfoService.findUserInfoList(pageNum, pageSize);
        ResponseDto.success(userInfos);
        return ResponseDto.success(userInfos);
    }


}
