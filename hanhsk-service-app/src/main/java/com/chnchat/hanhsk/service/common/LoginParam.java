package com.chnchat.hanhsk.service.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginParam {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    //时间戳
    private String timestamp;

    //应用appid
    private String appid;

    //签名
    private String sign;
}

