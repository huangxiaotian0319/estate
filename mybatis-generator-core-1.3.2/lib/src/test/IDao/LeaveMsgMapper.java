package test.IDao;

import test.domain.LeaveMsg;

public interface LeaveMsgMapper {
    int insert(LeaveMsg record);

    int insertSelective(LeaveMsg record);
}