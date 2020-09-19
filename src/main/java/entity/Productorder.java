package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Classname:Productorder
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-25 23:17
 * @Version: 1.0
 **/
public class Productorder implements Serializable {
    //商品订单的主键ID
    private int id;
    //商品的编号
    private String orderNum;
    //订单创建时间
    private Date orderTime;
    //出行人数
    private int peopleCount;
    //订单描述
    private String orderDes;
    //订单支付类型
    private int payType;
    /**
     * 微信支付
     */
    public static final int PAYTYPE_WECHATPAY = 1;
    /**
     * 支付宝支付
     */
    public static final int PAYTYPE_ALIPAY = 0;
    /**
     * 其他支付
     */
    public static final int PAYTYPE_OTHERPAY = 2;
    //订单状态
    private int orderStatus;
    /**
     * 未支付
     */
    public static final int ORDERSTATUS_UNPAID = 0;
    /**
     * 已支付
     */
    public static final int ORDERSTATUS_PAID = 1;
    //商品ID
    private int productId;
    //会员id
    private int memberId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Productorder{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime=" + orderTime +
                ", peopleCount=" + peopleCount +
                ", orderDes='" + orderDes + '\'' +
                ", payType=" + payType +
                ", orderStatus=" + orderStatus +
                ", productId=" + productId +
                ", memberId=" + memberId +
                '}';
    }
}
