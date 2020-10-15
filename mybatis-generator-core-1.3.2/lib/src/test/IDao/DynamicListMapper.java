package test.IDao;

import test.domain.DynamicList;

public interface DynamicListMapper {
    int insert(DynamicList record);

    int insertSelective(DynamicList record);
}