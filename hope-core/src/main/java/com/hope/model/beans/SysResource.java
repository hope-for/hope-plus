package com.hope.model.beans;

import com.hope.mybatis.pojo.CommonEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Transient;

/**
 * 资源数据对象类
 *
 * @program:hope-plus
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @微信公众号:低调小熊猫
 * @create:2018-10-16 10:16
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class SysResource extends CommonEntity {
    /**
     * 装逼的id
     **/
    @Column(name = "resourceId")//指定不符合第3条规则的字段名
    private String resourceId;
    /**
     * 资源名称
     **/
    private String name;
    /**
     * 权限描述
     **/
    private String description;
    /**
     * 权限访问路径
     **/
    private String url;
    /**
     * 权限标识
     **/
    private String permission;
    /**
     * 父编号
     **/
    @Column(name = "parentId")
    private Integer parentId;
    /**
     * 资源类型:0目录 1菜单 2按钮
     **/
    private Integer type;
    /**
     * 显示顺序
     **/
    private Integer priority;
    /**
     * 图标
     **/
    private String icon;
    /**
     * 是否可用:1有效2删除
     **/
    private Integer status;
    /**
     * 父name
     **/
    @Transient//添加该注解的字段不会作为表字段使用
    private String parentname;
}