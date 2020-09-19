package dao;

import entity.Administrator;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Classname:Administrator
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-09-03 18:24
 * @Version: 1.0
 **/
@Repository("administratorDao")
public interface AdministratorDao {
    /**
     * @return int
     * @Description :添加管理员
     * @Date 18:30 2020/9/3 0003
     * @Param * @param administrator ：
     **/
    public int save(Administrator administrator);

    /**
     * @param password ：
     * @return entity.Administrator
     * @Description :查找指定对象
     * @Date 18:31 2020/9/3 0003
     * @Param * @param name
     **/
    public Administrator findAdministrator(@Param("name") String name, @Param("password") String password);

    /**
     * @return boolean
     * @Description :通过邮箱查找用户
     * @Date 21:10 2020/9/15 0015
     * @Param * @param toEmail ：
     **/
    Administrator findAdministratorByEmail(String toEmail);
}
