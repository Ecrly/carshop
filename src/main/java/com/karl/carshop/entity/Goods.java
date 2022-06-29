package com.karl.carshop.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * 商品实体类
 */
public class Goods extends BaseEntity implements Serializable {

    /**
     * 商品id
     */
    private Integer gid;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 主图（一个url地址）
     */
    private String mainPicture;

    /**
     * 其他图片（此处格式存疑）
     */
    private String pictures;

    /**
     * 商品类别（此处是否关联有待考虑）
     */
    private String goodsType;

    /**
     * 商品价格
     */
    private Double goodsPrice;

    /**
     * 商品成本（此处存在权限区别：对普通用户不可见，对管理员可见）
     */
    private Double cost;

    /**
     * 商品库存
     */
    private Integer stock;

    /**
     * 商品销量
     */
    private Integer salesVolume;

    /**
     * 商品状态（上架、下架等）
     */
    private String goodsState;

    /**
     * 商品详情
     */
    private String details;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Goods goods = (Goods) o;
        return Objects.equals(gid, goods.gid) && Objects.equals(goodsName, goods.goodsName) && Objects.equals(mainPicture, goods.mainPicture) && Objects.equals(pictures, goods.pictures) && Objects.equals(goodsType, goods.goodsType) && Objects.equals(goodsPrice, goods.goodsPrice) && Objects.equals(cost, goods.cost) && Objects.equals(stock, goods.stock) && Objects.equals(salesVolume, goods.salesVolume) && Objects.equals(goodsState, goods.goodsState) && Objects.equals(details, goods.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gid, goodsName, mainPicture, pictures, goodsType, goodsPrice, cost, stock, salesVolume, goodsState, details);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", goodsName='" + goodsName + '\'' +
                ", mainPicture='" + mainPicture + '\'' +
                ", pictures='" + pictures + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", cost=" + cost +
                ", stock=" + stock +
                ", salesVolume=" + salesVolume +
                ", goodsState='" + goodsState + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
