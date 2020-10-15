package service.impl;

import dao.RoleDao;
import entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.RoleService;

import java.util.List;

/**
 * Classname:RoleServiceImpl
 *
 * @description:角色Role业务逻辑实现类
 * @author: 陌意随影
 * @Date: 2020-10-15 20:19
 * @Version: 1.0
 **/
@Service("roleService")
@Transactional
public class RoleServiceImpl  implements RoleService {
    @Autowired
    RoleDao roleDao;
    @Override
    public boolean saveRole(Role role) {
        return roleDao.saveRole(role) == 1;
    }

    @Override
    public boolean updateRole(Role role) {
        return roleDao.updateRole(role) == 1;
    }

    @Override
    public boolean deleteRoleById(int id) {
        return roleDao.deleteRoleById(id) == 1;
    }

    @Override
    public Role findOne(int id) {
        return roleDao.findOne(id);
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
