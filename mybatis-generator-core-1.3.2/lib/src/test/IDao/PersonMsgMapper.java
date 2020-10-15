package test.IDao;

import test.domain.PersonMsg;

public interface PersonMsgMapper {
    int insert(PersonMsg record);

    int insertSelective(PersonMsg record);
}