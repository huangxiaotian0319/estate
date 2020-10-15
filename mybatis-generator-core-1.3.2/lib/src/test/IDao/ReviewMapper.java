package test.IDao;

import test.domain.Review;

public interface ReviewMapper {
    int insert(Review record);

    int insertSelective(Review record);
}