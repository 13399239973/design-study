package com.design.auth.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class User implements Serializable {


    /**
     * 用户ID
     */
    private int id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话号码
     */
    private String cellphone;

    /**
     * 邮箱
     */
    private String emial;

    /**
     * 年龄
     */
    private int age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 用户状态
     */
    private int status;

    /**
     * 自我描述
     */
    private String description;

    /**
     * 注册时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    /**
     * 扩展字段
     */
    private String extendStr1;
    private String extendStr2;
    private String extendStr3;


}
