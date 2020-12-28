package com.fortmie.lib.api.model;



import com.fortmie.lib.api.enums.ValidFlagEnum;

import java.util.Date;

/**
 * 实体类父类
 */

public class BaseDTO {
    /**
     * 数据ID
     */
    private Integer id;
    /**
     * 临时字段1
     */
    private String temp1;

    private String temp2;

    private Date createDate;

    private Date updateDate;
    /**
     * 数据有效性
     */
    private ValidFlagEnum validFlag;
}
