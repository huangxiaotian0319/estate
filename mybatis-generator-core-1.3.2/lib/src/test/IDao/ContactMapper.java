package test.IDao;

import test.domain.Contact;

public interface ContactMapper {
    int insert(Contact record);

    int insertSelective(Contact record);
}