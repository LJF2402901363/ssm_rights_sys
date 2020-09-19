package entity;

import util.DateUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * Classname:Product
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-25 23:16
 * @Version: 1.0
 **/
public class Product implements Serializable {
    //数据库中的ID主键
    private int id;
    //商品的唯一编码
    private String productNum;
    //商品的名字
    private String productName;
    //出发城市
    private String cityName;
    //触发时间
    private Date departureTime;
    private String departureTimeStr;
    //商品价格
    private double productPrice;
    //商品描述
    private String productDes;
    //商品状态
    private int productStatus;
    //商品状态的字符串
    private String productStatusStr;
    //开启状态
    public static final int OPEN_STATUS = 1;
    //关闭状态
    public static final int CLOSE_STATUS = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductStatusStr() {
        if (this.productStatus == Product.CLOSE_STATUS) {
            this.productStatusStr = "关闭";
        }
        if (this.productStatus == Product.OPEN_STATUS) {
            this.productStatusStr = "开启";
        }
        return productStatusStr;
    }

    public String getDepartureTimeStr() {
        return DateUtil.dateToDateStr("yyyy-MM-dd HH:mm:ss", this.departureTime);
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime=" + departureTime +
                ", productPrice=" + productPrice +
                ", productDes='" + productDes + '\'' +
                ", productStatus=" + productStatus +
                '}';
    }
}
