package com.karl.carshop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 洗车订单
 * </p>
 *
 * @author cl
 * @since 2022-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("w_wash_order")
@ApiModel(value="WashOrder对象", description="洗车订单")
public class WashOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    @ApiModelProperty(value = "下单用户Id")
    private Integer uid;

    @ApiModelProperty(value = "下单门店Id")
    private Integer sid;

    @ApiModelProperty(value = "订单号")
    private String orderNumber;

    @ApiModelProperty(value = "联系电话")
    private String userPhone;

    @ApiModelProperty(value = "联系人")
    private String username;

    @ApiModelProperty(value = "车型")
    private String carType;

    @ApiModelProperty(value = "车的照片")
    private String carPicture;

    @ApiModelProperty(value = "订单价格")
    private Double price;

    @ApiModelProperty(value = "订单状态")
    private String state;

    @ApiModelProperty(value = "洗车工")
    private String worker;

    @ApiModelProperty(value = "洗车类型：立即or预定")
    private String washType;

    @ApiModelProperty(value = "预定时间")
    private Date appointment;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "日志-创建人")
    private String createdUser;

    @ApiModelProperty(value = "日志-创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "日志-最后修改执行人")
    private String modifiedUser;

    @ApiModelProperty(value = "日志-最后修改时间")
    private Date modifiedTime;


}
