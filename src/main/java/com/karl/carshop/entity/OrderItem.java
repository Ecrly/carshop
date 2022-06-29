package com.karl.carshop.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrderItem extends BaseEntity implements Serializable {

    /**
     * 订单条目id
     */
    private Integer tid;

    /**
     * 所属订单的id
     */
    private Integer oid;

    /**
     * 商品id
     */
    private Integer gid;

    /**
     * 商品价格
     */
    private Double price;

    /**
     * 商品数量
     */
    private Integer num;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(tid, orderItem.tid) && Objects.equals(oid, orderItem.oid) && Objects.equals(gid, orderItem.gid) && Objects.equals(price, orderItem.price) && Objects.equals(num, orderItem.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tid, oid, gid, price, num);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "tid=" + tid +
                ", oid=" + oid +
                ", gid=" + gid +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
