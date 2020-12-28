package com.fortmie.lib.api.model.book;


import com.fortmie.lib.api.model.BaseDTO;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import java.util.Date;

/**
书籍实体类
 * @author 92872
 */
@Data
public class BookDTO extends BaseDTO implements Serializable {


    private String bookName;

    private Integer bookClassId;

    private BigDecimal bookPrice;

    private String bookPublish;

    private String bookAuthor;
    /**
     * 书籍图片
     */
    private String bookImg;

    private Date publishDate;

}
