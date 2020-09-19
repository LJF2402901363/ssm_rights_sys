package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Classname:Log
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-25 23:13
 * @Version: 1.0
 **/
public class Log implements Serializable {
    //日志的id
    private int id;
    //访问时间
    private Date visitTime;
    //操作者的用户名
    private String userName;
    //访问的IP
    private String ip;
    //访问的资源路径
    private String url;
    //执行的时间时长
    private int executionTime;
    //访问的方法
    private String method;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", visitTime=" + visitTime +
                ", userName='" + userName + '\'' +
                ", ip='" + ip + '\'' +
                ", url='" + url + '\'' +
                ", executionTime=" + executionTime +
                ", method='" + method + '\'' +
                '}';
    }
}
