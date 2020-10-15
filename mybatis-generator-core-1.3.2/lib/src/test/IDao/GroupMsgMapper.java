package test.IDao;

import test.domain.GroupMsg;

public interface GroupMsgMapper {
    int insert(GroupMsg record);

    int insertSelective(GroupMsg record);
}