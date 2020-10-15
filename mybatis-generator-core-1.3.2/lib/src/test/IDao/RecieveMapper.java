package test.IDao;

import test.domain.Recieve;

public interface RecieveMapper {
    int insert(Recieve record);

    int insertSelective(Recieve record);
}