package service.impl;

import dao.AdministratorDao;
import entity.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AdministratorService;

/**
 * Classname:AdministratorServiceImpl
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-09-03 18:41
 * @Version: 1.0
 **/
@Service("administratorService")
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorDao administratorDao;

    @Override
    public Administrator login(Administrator administrator) {
        if (administrator.getName() == null || administrator.getPassword() == null) {
            return null;
        }
        String name = "";
        if (administrator.getName() != null) {
            name = administrator.getName();
        }
        if (administrator.getEmail() != null) {
            name = administrator.getEmail();
        }
        if (administrator.getPhoneNum() != null) {
            name = administrator.getPhoneNum();
        }
        //从数据库中查看是否存在
        Administrator loginAdm = administratorDao.findAdministrator(name, administrator.getPassword());
        return loginAdm;
    }

    @Override
    public boolean isRegister(Administrator administrator) {
        return administratorDao.findAdministrator(administrator.getName(), administrator.getPassword()) != null;
    }

    @Override
    public boolean saveAdministrator(Administrator administrator) {
        return administratorDao.save(administrator) == 1;
    }

    @Override
    public boolean isEmailRegister(String toEmail) {
        return administratorDao.findAdministratorByEmail(toEmail) != null;
    }
}
