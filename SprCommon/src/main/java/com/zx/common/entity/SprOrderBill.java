package com.zx.common.entity;

import java.io.Serializable;

/**
 * 
 */
public class SprOrderBill implements Serializable {
    private Long id;
    private String name;

    public SprOrderBill() {
    }

    public SprOrderBill(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
