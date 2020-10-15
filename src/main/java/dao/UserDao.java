package dao;

import entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Classname:ssmdemo
 *
 * @description:用户DAO
 * @author: 陌意随影
 * @Date: 2020-10-15 16:55
 */
@Repository("userDao")
public interface UserDao {
    /**
     * @Description :查找所有的User
     * @Date 19:56 2020/10/15 0015
     * @Param * @param  ：
     * @return java.util.List<entity.User>
     **/
    public List<User> findALl();
    /**
     * @Description :通过id查找到指定的User
     * @Date 19:56 2020/10/15 0015
     * @Param * @param id ：
     * @return entity.User
     **/
    public User findOne(int id);
    /**
     * @Description :将User保存到数据库中去
     * @Date 19:57 2020/10/15 0015
     * @Param * @param user ：
     * @return int
     **/
    public int saveUser(User user);
    /**
     * @Description :更新用户
     * @Date 20:00 2020/10/15 0015
     * @Param * @param user ：
     * @return int
     **/
    public int updateUser(User user);
    /**
     * @Description :删除用户
     * @Date 20:00 2020/10/15 0015
     * @Param * @param id ：
     * @return int
     **/
    public int deleteUserById(int id);
    public List<User> findUserByPage();
}
