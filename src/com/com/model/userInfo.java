package com.com.model;

import java.util.Date;

public class userInfo {
    private Integer id;

    private String userName;

    private String loginAccount;

    private String loginPassword;

    private Date createTime;

    private Date updateTime;

    private String mobile;

    private String email;

    private String isavaliable;

    private String userCode;

    private String marjorType;

    private String tell;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIsavaliable() {
        return isavaliable;
    }

    public void setIsavaliable(String isavaliable) {
        this.isavaliable = isavaliable == null ? null : isavaliable.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getMarjorType() {
        return marjorType;
    }

    public void setMarjorType(String marjorType) {
        this.marjorType = marjorType == null ? null : marjorType.trim();
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell == null ? null : tell.trim();
    }
}