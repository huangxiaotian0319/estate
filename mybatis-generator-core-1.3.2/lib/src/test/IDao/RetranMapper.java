package test.IDao;

import test.domain.Retran;

public interface RetranMapper {
    int insert(Retran record);

    int insertSelective(Retran record);
}