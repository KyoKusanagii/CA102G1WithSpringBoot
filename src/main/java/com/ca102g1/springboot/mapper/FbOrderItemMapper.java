package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.FbOrderItem;
import com.ca102g1.springboot.model.FbOrderItemExample;
import com.ca102g1.springboot.model.FbOrderItemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbOrderItemMapper {
    int countByExample(FbOrderItemExample example);

    int deleteByExample(FbOrderItemExample example);

    int deleteByPrimaryKey(FbOrderItemKey key);

    int insert(FbOrderItem record);

    int insertSelective(FbOrderItem record);

    List<FbOrderItem> selectByExampleWithBLOBs(FbOrderItemExample example);

    List<FbOrderItem> selectByExample(FbOrderItemExample example);

    FbOrderItem selectByPrimaryKey(FbOrderItemKey key);

    int updateByExampleSelective(@Param("record") FbOrderItem record, @Param("example") FbOrderItemExample example);

    int updateByExampleWithBLOBs(@Param("record") FbOrderItem record, @Param("example") FbOrderItemExample example);

    int updateByExample(@Param("record") FbOrderItem record, @Param("example") FbOrderItemExample example);

    int updateByPrimaryKeySelective(FbOrderItem record);

    int updateByPrimaryKeyWithBLOBs(FbOrderItem record);

    int updateByPrimaryKey(FbOrderItem record);
}