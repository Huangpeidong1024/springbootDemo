package com.minstone.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.minstone.dao.UserInfoDao;
import com.minstone.entity.UserInfo;
import com.minstone.entity.vo.UserInfoVo;
import com.minstone.service.UserInfoService;
import com.minstone.utils.PageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Description:
 * @Author: HuangPeiDong
 * @Date: 2020/8/30 10:45
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfoVo findByUserNameAndPassword(String userName, String password) {
        Example example = new Example(UserInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName",userName);
        criteria.andEqualTo("password",password);
        UserInfo userInfoList = userInfoDao.selectOneByExample(example);
        //将实体类转换为VO
        UserInfoVo UserInfoVo = JSON.parseObject(JSON.toJSONString(userInfoList), UserInfoVo.class);
        return UserInfoVo;
    }

    @Override
    public PageInfo<UserInfoVo> findUserInfoList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserInfo> userInfoList = userInfoDao.selectAll();
        //将实体类转换为VO
        List<UserInfoVo> userInfoVoList = JSON.parseArray(JSON.toJSONString(userInfoList), UserInfoVo.class);
        PageInfo<UserInfo> pageInfo=new PageInfo<>(userInfoList);
        PageInfo<UserInfoVo> pageInfoVo=new PageInfo<>(userInfoVoList);
        PageConverter.pass2Vo(pageInfo, pageInfoVo);
        return pageInfoVo;
    }



}
