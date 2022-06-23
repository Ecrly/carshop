package com.karl.carshop.entity;

import java.io.Serializable;

public class Order extends BaseEntity implements Serializable {

    private Integer oid;
    private Integer fkGoodsOrder;
    private Integer fkUserOrder;
    private String orderNumber;
    private Double orderPrice;
    private String address;
    private String paymentMethod;
    private String sendMethod;
    private String courierNumber;
    private String orderState;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getFkGoodsOrder() {
        return fkGoodsOrder;
    }

    public void setFkGoodsOrder(Integer fkGoodsOrder) {
        this.fkGoodsOrder = fkGoodsOrder;
    }

    public Integer getFkUserOrder() {
        return fkUserOrder;
    }

    public void setFkUserOrder(Integer fkUserOrder) {
        this.fkUserOrder = fkUserOrder;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSendMethod() {
        return sendMethod;
    }

    public void setSendMethod(String sendMethod) {
        this.sendMethod = sendMethod;
    }

    public String getCourierNumber() {
        return courierNumber;
    }

    public void setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }
}
