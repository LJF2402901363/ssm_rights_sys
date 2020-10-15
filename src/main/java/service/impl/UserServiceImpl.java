package service.impl;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import java.util.List;

/**
 * Classname:UserServiceImpl
 *
 * @description:User的业务逻辑实现类
 * @author: 陌意随影
 * @Date: 2020-10-15 20:15
 * @Version: 1.0
 **/
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user) == 1;
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user) == 1;
    }

    @Override
    public boolean deleteUserById(int id) {
        return userDao.deleteUserById(id) == 1;
    }

    @Override
    public User findOne(int id) {
        return userDao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findALl();
    }

    @Override
    public List<User> findProductByPageBean(String searchContent) {
        return null;
    }
}
