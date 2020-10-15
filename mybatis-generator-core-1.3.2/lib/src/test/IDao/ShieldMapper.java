package test.IDao;

import test.domain.Shield;

public interface ShieldMapper {
    int insert(Shield record);

    int insertSelective(Shield record);
}