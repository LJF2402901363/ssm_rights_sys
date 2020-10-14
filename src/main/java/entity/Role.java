package entity;
import java.util.List;
import java.io.Serializable;

/**
 * Classname:Role
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-25 23:17
 * @Version: 1.0
 **/
public class Role implements Serializable {
    //角色的ID主键
    private int id;
    //角色名称
    private String roleName;
    //角色描述
    private String roleDes;
    //角色列表
    private List<User> userList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDes='" + roleDes + '\'' +
                ", roleList=" + userList +
                '}';
    }
}
