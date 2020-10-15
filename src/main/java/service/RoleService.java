package service;
import entity.Role;
import java.util.List;
/**
 * Classname:ssmdemo
 *
 * @description:{description}
 * @author: 陌意随影
 * @Date: 2020-10-15 20:11
 */
public interface RoleService {
    /**
     * @Description :保存Role角色
     * @Date 20:12 2020/10/15 0015
     * @Param * @param Role ：
     * @return boolean
     **/
    public boolean saveRole(Role role);
    /**
     * @Description :更新Role角色
     * @Date 20:12 2020/10/15 0015
     * @Param * @param Role ：
     * @return boolean
     **/
    public boolean updateRole(Role role);
    /**
     * @Description :通过ID删除Role角色
     * @Date 20:13 2020/10/15 0015
     * @Param * @param Role ：
     * @return boolean
     **/
    public boolean deleteRoleById(int id);
    /**
     * @Description :通过ID查找Role角色
     * @Date 20:14 2020/10/15 0015
     * @Param * @param id ：
     * @return entity.Role
     **/
    public Role findOne(int id);
    /**
     * @Description :查找所有的Role角色
     * @Date 20:14 2020/10/15 0015
     * @Param * @param  ：
     * @return java.util.List<entity.Role>
     **/
    public List<Role> findAll();
}
