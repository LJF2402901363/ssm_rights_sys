package dao;
import java.util.List;
import entity.Role;
import org.springframework.stereotype.Repository;

/**
 * Classname:ssmdemo
 *
 * @description:{description}
 * @author: 陌意随影
 * @Date: 2020-08-26 11:08
 */
@Repository("roleDao")
public interface RoleDao {
    /**
     * @Description :获取所有的Role对象并封装到一个List中去
     * @Date 19:48 2020/10/15 0015
     * @Param * @param  ：
     * @return java.util.List<entity.Role>
     **/
    public List<Role> findAll();
    /**
     * @Description :通过ID删除Role
     * @Date 19:49 2020/10/15 0015
     * @Param * @param id ：
     * @return int
     **/
    public int deleteRoleById(int id);
    /**
     * @Description :保存Role对象到数据库中去
     * @Date 19:50 2020/10/15 0015
     * @Param * @param role ：
     * @return int
     **/
    public int saveRole(Role role);
    /**
     * @Description :更新Role对象
     * @Date 19:50 2020/10/15 0015
     * @Param * @param role ：
     * @return int
     **/
    public int updateRole(Role role);
    /**
     * @Description :通过id查找Role
     * @Date 19:51 2020/10/15 0015
     * @Param * @param id ：
     * @return entity.Role
     **/
    public Role findOne(int id);
}
