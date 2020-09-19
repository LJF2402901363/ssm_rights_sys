package entity;

import java.io.Serializable;

/**
 * Classname:Permission
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-25 23:13
 * @Version: 1.0
 **/
public class Permission implements Serializable {
    //资源权限的id
    private int id;
    //资源路径
    private String url;
    //资源名称
    private String permissionName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", permissionName='" + permissionName + '\'' +
                '}';
    }
}
