package test.IDao;

import test.domain.ProductWithBLOBs;

public interface ProductMapper {
    int insert(ProductWithBLOBs record);

    int insertSelective(ProductWithBLOBs record);
}