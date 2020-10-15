package test.IDao;

import test.domain.Report;

public interface ReportMapper {
    int insert(Report record);

    int insertSelective(Report record);
}