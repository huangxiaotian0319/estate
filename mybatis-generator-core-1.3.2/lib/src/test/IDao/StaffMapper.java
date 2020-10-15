package test.IDao;

import test.domain.Staff;

public interface StaffMapper {
    int insert(Staff record);

    int insertSelective(Staff record);
}