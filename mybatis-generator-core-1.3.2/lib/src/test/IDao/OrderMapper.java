package test.IDao;

import test.domain.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}