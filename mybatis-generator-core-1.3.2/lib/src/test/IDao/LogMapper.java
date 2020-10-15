package test.IDao;

import test.domain.LogWithBLOBs;

public interface LogMapper {
    int insert(LogWithBLOBs record);

    int insertSelective(LogWithBLOBs record);
}