package test.IDao;

import test.domain.ContactWay;

public interface ContactWayMapper {
    int insert(ContactWay record);

    int insertSelective(ContactWay record);
}