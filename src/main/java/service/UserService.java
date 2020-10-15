package service;

import entity.User;
import java.util.List;
/**
 * Classname:ssmdemo
 *
 * @description:{description}
 * @author: 陌意随影
 * @Date: 2020-10-15 20:11
 */
public interface UserService {
    /**
     * @Description :保存用户
     * @Date 20:12 2020/10/15 0015
     * @Param * @param user ：
     * @return boolean
     **/
    public boolean saveUser(User user);
    /**
     * @Description :更新用户
     * @Date 20:12 2020/10/15 0015
     * @Param * @param user ：
     * @return boolean
     **/
    public boolean updateUser(User user);
    /**
     * @Description :通过ID删除用户
     * @Date 20:13 2020/10/15 0015
     * @Param * @param user ：
     * @return boolean
     **/
    public boolean deleteUserById(int id);
    /**
     * @Description :通过ID查找用户
     * @Date 20:14 2020/10/15 0015
     * @Param * @param id ：
     * @return entity.User
     **/
    public User findOne(int id);
    /**
     * @Description :查找所有的用户
     * @Date 20:14 2020/10/15 0015
     * @Param * @param  ：
     * @return java.util.List<entity.User>
     **/
    public List<User> findAll();
    /**
     * @Description :通过搜索分页查找
     * @Date 20:32 2020/10/15 0015
     * @Param * @param searchContent ：
     * @return java.util.List<entity.User>
     **/
    List<User> findProductByPageBean(String searchContent);
}
