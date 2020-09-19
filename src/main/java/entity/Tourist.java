package entity;

import java.io.Serializable;

/**
 * Classname:Tourist
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-25 23:19
 * @Version: 1.0
 **/
public class Tourist implements Serializable {
    //旅客的主键ID
    private int id;
    //旅客的名字
    private String name;
    //旅客的性别
    private String sex;
    /**
     * 男性
     */
    public static final String SEX_MALE = "男";
    /**
     * 女性
     */
    public static final String SEX_FEMALE = "女";
    /**
     * 性别未知
     */
    public static final String SEX_UNKNOW = "中性";
    //手机号
    private String phoneNum;
    //身份证
    private String identityCardNum;
    //身份证类型
    private String identityCardType;
    /**
     * 身份证
     */
    public static final int IDENTITYCARDTYPE_IDENTITYCARD = 0;
    /**
     * 护照
     */
    public static final int IDENTITYCARDTYPE_PASSPORT = 1;
    /**
     * 军官证
     */
    public static final int IDENTITYCARDTYPE_OFFICERCARD = 2;

    //游客类型
    private String touristType;
    /**
     * 儿童游客
     */
    public static final int TOURISTTYPE_CHILDREN = 1;
    /**
     * 成人游客
     */
    public static final int TOURISTTYPE_ADULT = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIdentityCardNum() {
        return identityCardNum;
    }

    public void setIdentityCardNum(String identityCardNum) {
        this.identityCardNum = identityCardNum;
    }

    public String getIdentityCardType() {
        return identityCardType;
    }

    public void setIdentityCardType(String identityCardType) {
        this.identityCardType = identityCardType;
    }

    public String getTouristType() {
        return touristType;
    }

    public void setTouristType(String touristType) {
        this.touristType = touristType;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", identityCardNum='" + identityCardNum + '\'' +
                ", identityCardType='" + identityCardType + '\'' +
                ", touristType='" + touristType + '\'' +
                '}';
    }
}
