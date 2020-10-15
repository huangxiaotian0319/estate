package test.IDao;

import test.domain.Cart;

public interface CartMapper {
    int insert(Cart record);

    int insertSelective(Cart record);
}