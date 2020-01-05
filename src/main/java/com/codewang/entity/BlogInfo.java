package com.codewang.entity;

import java.math.BigDecimal;

public class BlogInfo {

    /**
     *  id
     */
    private String id;

    /**
     * 书名
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
