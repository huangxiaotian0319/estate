package test.IDao;

import test.domain.DynamicRetran;

public interface DynamicRetranMapper {
    int insert(DynamicRetran record);

    int insertSelective(DynamicRetran record);
}