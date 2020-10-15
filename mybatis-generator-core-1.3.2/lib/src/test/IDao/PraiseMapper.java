package test.IDao;

import test.domain.Praise;

public interface PraiseMapper {
    int insert(Praise record);

    int insertSelective(Praise record);
}