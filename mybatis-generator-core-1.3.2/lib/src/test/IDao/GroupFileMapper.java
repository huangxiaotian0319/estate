package test.IDao;

import test.domain.GroupFile;

public interface GroupFileMapper {
    int insert(GroupFile record);

    int insertSelective(GroupFile record);
}