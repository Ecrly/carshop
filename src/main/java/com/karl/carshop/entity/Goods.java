package com.karl.carshop.entity;

import java.io.Serializable;

public class Goods extends BaseEntity implements Serializable {

    private Integer gid;
    private String name;
    private String mainPicture;
    private String type;
    private Double goodsPrice;
    private Double cost;
    private Integer stock;
    private Integer salesVolume;
    private String goodsState;
    private String details;

    public Goods(){}

    public Goods(Integer gid, String name, String mainPicture, String type, Double goodsPrice, Double cost, Integer stock, Integer salesVolume, String goodsState, String details) {
        this.gid = gid;
        this.name = name;
        this.mainPicture = mainPicture;
        this.type = type;
        this.goodsPrice = goodsPrice;
        this.cost = cost;
        this.stock = stock;
        this.salesVolume = salesVolume;
        this.goodsState = goodsState;
        this.details = details;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(String goodsState) {
        this.goodsState = goodsState;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
