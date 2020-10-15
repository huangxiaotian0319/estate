package test.IDao;

import test.domain.Tag;

public interface TagMapper {
    int insert(Tag record);

    int insertSelective(Tag record);
}