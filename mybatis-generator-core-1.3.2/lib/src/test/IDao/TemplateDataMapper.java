package test.IDao;

import test.domain.TemplateDataWithBLOBs;

public interface TemplateDataMapper {
    int insert(TemplateDataWithBLOBs record);

    int insertSelective(TemplateDataWithBLOBs record);
}