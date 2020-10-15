package test.IDao;

import test.domain.Publish;

public interface PublishMapper {
    int insert(Publish record);

    int insertSelective(Publish record);
}