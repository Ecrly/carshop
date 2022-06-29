package com.karl.carshop.entity;

import java.io.Serializable;

public class Order extends BaseEntity implements Serializable {

    private Integer oid;
    private Integer uid;
    private String orderNumber;
    private Double orderPrice;
    private String address;
    private String paymentMethod;
    private String sendMethod;
    private String courierNumber;
    private String orderState;



}
