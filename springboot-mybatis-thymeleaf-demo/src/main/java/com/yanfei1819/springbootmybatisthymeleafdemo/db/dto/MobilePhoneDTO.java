package com.yanfei1819.springbootmybatisthymeleafdemo.db.dto;

/**
 * Created by 追梦1819 on 2019-05-27.
 */
public class MobilePhoneDTO {
    private Long id;
    private String name;
    private Double price;
    private String color;
    private String productionDate;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }
}
