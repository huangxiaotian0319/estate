package test.IDao;

import test.domain.Statistic;

public interface StatisticMapper {
    int insert(Statistic record);

    int insertSelective(Statistic record);
}