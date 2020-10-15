package test.IDao;

import test.domain.PersonInfoWithBLOBs;

public interface PersonInfoMapper {
    int insert(PersonInfoWithBLOBs record);

    int insertSelective(PersonInfoWithBLOBs record);
}