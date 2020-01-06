package com.design.common.model;



import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class Menu implements Serializable {
    private Integer id;
    //路径
    private String path;
    //组件
    private String component;
    //只有404页面用到了redirect其他其实默认不设置也有同样效果
    private String redirect;
    private String icon;
    private String title;

    private Integer parentId;

    private Set<Menu> children=new HashSet<>();
    private Boolean hidden=false;
    private Integer sort;
    //类型0菜单1按钮
    private Integer type;
    //菜单所属系统编码最基础的命名为BASE
    private String system;
    private Date createTime;
    private Date updateTime;
}