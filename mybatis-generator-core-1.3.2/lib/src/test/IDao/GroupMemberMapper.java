package test.IDao;

import test.domain.GroupMember;

public interface GroupMemberMapper {
    int insert(GroupMember record);

    int insertSelective(GroupMember record);
}