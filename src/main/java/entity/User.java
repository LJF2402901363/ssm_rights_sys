package entity;

import java.io.Serializable;
import java.util.List;
/**
 * Classname:User
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-25 23:19
 * @Version: 1.0
 **/
public class User implements Serializable {
    //用户主键ID
    private int id;
    //用户名
    private String userName;
    //用户邮箱
    private String email;
    //用户密码
    private String password;
    //用户手机
    private String phoneNum;
    //用户状态
    private int status;
    //角色列表
    private List<Role> roleList;
    /**
     * 关闭状态
     */
    public static final int CLOSE_STATUS = 0;
    /**
     * 开启状态
     */
    public static final int OPEN_STATUS = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", status=" + status +
                ", roleList=" + roleList +
                '}';
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
