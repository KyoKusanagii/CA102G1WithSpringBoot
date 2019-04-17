package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.MallOrder;
import com.ca102g1.springboot.model.MallOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallOrderMapper {
    int countByExample(MallOrderExample example);

    int deleteByExample(MallOrderExample example);

    int deleteByPrimaryKey(String mallOrderNo);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    List<MallOrder> selectByExample(MallOrderExample example);

    MallOrder selectByPrimaryKey(String mallOrderNo);

    int updateByExampleSelective(@Param("record") MallOrder record, @Param("example") MallOrderExample example);

    int updateByExample(@Param("record") MallOrder record, @Param("example") MallOrderExample example);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);
}