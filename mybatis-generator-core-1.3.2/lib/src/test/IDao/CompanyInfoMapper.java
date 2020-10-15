package test.IDao;

import test.domain.CompanyInfoWithBLOBs;

public interface CompanyInfoMapper {
    int insert(CompanyInfoWithBLOBs record);

    int insertSelective(CompanyInfoWithBLOBs record);
}