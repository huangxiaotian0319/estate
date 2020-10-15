package test.IDao;

import test.domain.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}