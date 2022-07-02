package com.karl.carshop.entity;

import java.io.Serializable;
import java.util.Objects;

public class Order extends BaseEntity implements Serializable {

    /**
     * 订单id
     */
    private Integer oid;

    /**
     * 关联用户id 一个用户可以有多个订单
     */
    private Integer uid;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 订单金额
     */
    private Double orderPrice;

    /**
     * 下单地址
     */
    private String address;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 运输方式
     */
    private String sendMethod;

    /**
     * 快递单号
     */
    private String courierNumber;

    /**
     * 订单状态：已完成、取消、等
     */
    private String orderState;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Order order = (Order) o;
        return Objects.equals(oid, order.oid) && Objects.equals(uid, order.uid) && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(orderPrice, order.orderPrice) && Objects.equals(address, order.address) && Objects.equals(paymentMethod, order.paymentMethod) && Objects.equals(sendMethod, order.sendMethod) && Objects.equals(courierNumber, order.courierNumber) && Objects.equals(orderState, order.orderState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), oid, uid, orderNumber, orderPrice, address, paymentMethod, sendMethod, courierNumber, orderState);
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderPrice=" + orderPrice +
                ", address='" + address + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", sendMethod='" + sendMethod + '\'' +
                ", courierNumber='" + courierNumber + '\'' +
                ", orderState='" + orderState + '\'' +
                '}';
    }
}
