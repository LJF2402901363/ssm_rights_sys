package entity;

import java.io.Serializable;

/**
 * Classname:UserMember
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-25 23:20
 * @Version: 1.0
 **/
public class UserMember implements Serializable {
    //会员的主键ID
    private int id;
    //会员的名字
    private String name;
    //会员的昵称
    private String nickName;
    //会员的手机号码
    private String phoneNum;
    //会员的邮箱
    private String email;
    //会员的密码
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
