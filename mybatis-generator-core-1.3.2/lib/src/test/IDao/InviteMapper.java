package test.IDao;

import test.domain.Invite;

public interface InviteMapper {
    int insert(Invite record);

    int insertSelective(Invite record);
}