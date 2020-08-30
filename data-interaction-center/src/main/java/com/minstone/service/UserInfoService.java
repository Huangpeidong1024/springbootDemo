package com.minstone.service;

import com.github.pagehelper.PageInfo;
import com.minstone.entity.vo.UserInfoVo;

/**
 * @Description:
 * @Author: HuangPeiDong
 * @Date: 2020/8/30 10:45
 **/
public interface UserInfoService {


    /**
     * 查询用户列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<UserInfoVo> findUserInfoList(int pageNum, int pageSize);

    /**
     * 根据用户名和密码查询用户
     *
     * @param userName
     * @param password
     * @return
     */
    public UserInfoVo findByUserNameAndPassword(String userName, String password);
}
