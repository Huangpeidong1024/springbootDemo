package com.minstone.entity.vo;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: HuangPeiDong
 * @Date: 2020/8/30 10:44
 **/
@Table(name = "s_user_info")
public class UserInfoVo implements Serializable {

    /**
     * id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像
     */
    private String headimg;
    /**
     * 联系方式
     */
    private String mobile;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别 0-男 1-女
     */
    private Boolean sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 真实姓名
     */
    private String realName;
    // 职位
    /**
     * 职位
     */
    private String position;
    /**
     * 状态 10-正常 20-锁定 30-作废
     */
    private Integer status;
    /**
     * 删除 0-否 1-是
     */
    private Boolean deleted;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改者
     */
    private String updateBy;
    /**
     * 修改时间
     */
    private Date updateTime;

    public void setId(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUserName(String value) {
        this.userName = value;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setNickname(String value) {
        this.nickname = value;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setHeadimg(String value) {
        this.headimg = value;
    }

    public String getHeadimg() {
        return this.headimg;
    }

    public void setMobile(String value) {
        this.mobile = value;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getAddress() {
        return this.address;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSex(Boolean value) {
        this.sex = value;
    }

    public Boolean getSex() {
        return this.sex;
    }

    public void setAge(Integer value) {
        this.age = value;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setRealName(String value) {
        this.realName = value;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setPosition(String value) {
        this.position = value;
    }

    public String getPosition() {
        return this.position;
    }

    public void setStatus(Integer value) {
        this.status = value;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setDeleted(Boolean value) {
        this.deleted = value;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setCreateBy(String value) {
        this.createBy = value;
    }

    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateTime(Date value) {
        this.createTime = value;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setUpdateBy(String value) {
        this.updateBy = value;
    }

    public String getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateTime(Date value) {
        this.updateTime = value;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

}
