package test.IDao;

import test.domain.Vip;

public interface VipMapper {
    int insert(Vip record);

    int insertSelective(Vip record);
}