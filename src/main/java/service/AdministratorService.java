package service;

import entity.Administrator;

/**
 * Classname:ssmdemo
 *
 * @description:{description}
 * @author: 陌意随影
 * @Date: 2020-09-03 18:40
 */
public interface AdministratorService {
    /**
     * @return boolean
     * @Description :管理员登录的业务逻辑
     * @Date 18:40 2020/9/3 0003
     * @Param * @param administrator ：
     **/
    public Administrator login(Administrator administrator);

    /**
     * @return boolean
     * @Description :判断是否注册
     * @Date 0:37 2020/9/15 0015
     * @Param * @param administrator ：
     **/
    public boolean isRegister(Administrator administrator);

    /**
     * @return boolean
     * @Description :保存管理员
     * @Date 0:42 2020/9/15 0015
     * @Param * @param administrator ：
     **/
    public boolean saveAdministrator(Administrator administrator);

    /**
     * @return boolean
     * @Description :查看该邮箱是否已经被注册
     * @Date 21:09 2020/9/15 0015
     * @Param * @param toEmail ：
     **/
    public boolean isEmailRegister(String toEmail);
}
