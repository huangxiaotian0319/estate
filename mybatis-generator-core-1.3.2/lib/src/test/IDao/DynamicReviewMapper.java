package test.IDao;

import test.domain.DynamicReviewWithBLOBs;

public interface DynamicReviewMapper {
    int insert(DynamicReviewWithBLOBs record);

    int insertSelective(DynamicReviewWithBLOBs record);
}