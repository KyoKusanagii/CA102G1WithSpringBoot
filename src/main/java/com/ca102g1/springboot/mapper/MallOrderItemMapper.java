package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.MallOrderItem;
import com.ca102g1.springboot.model.MallOrderItemExample;
import com.ca102g1.springboot.model.MallOrderItemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallOrderItemMapper {
    int countByExample(MallOrderItemExample example);

    int deleteByExample(MallOrderItemExample example);

    int deleteByPrimaryKey(MallOrderItemKey key);

    int insert(MallOrderItem record);

    int insertSelective(MallOrderItem record);

    List<MallOrderItem> selectByExample(MallOrderItemExample example);

    MallOrderItem selectByPrimaryKey(MallOrderItemKey key);

    int updateByExampleSelective(@Param("record") MallOrderItem record, @Param("example") MallOrderItemExample example);

    int updateByExample(@Param("record") MallOrderItem record, @Param("example") MallOrderItemExample example);

    int updateByPrimaryKeySelective(MallOrderItem record);

    int updateByPrimaryKey(MallOrderItem record);
}