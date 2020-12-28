package com.fortmie.lib.api.model.book;


import com.fortmie.lib.api.model.BaseDTO;
import lombok.Data;

import java.io.Serializable;

/**
 * 书籍分类实体类
 * @author 92872
 */

public class BookClassDTO extends BaseDTO implements Serializable {
    /**
     * 分类名称
     */
    private String name;
}
