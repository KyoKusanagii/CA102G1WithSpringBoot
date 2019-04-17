package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.FbOrder;
import com.ca102g1.springboot.model.FbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbOrderMapper {
    int countByExample(FbOrderExample example);

    int deleteByExample(FbOrderExample example);

    int deleteByPrimaryKey(String fbOrderNo);

    int insert(FbOrder record);

    int insertSelective(FbOrder record);

    List<FbOrder> selectByExample(FbOrderExample example);

    FbOrder selectByPrimaryKey(String fbOrderNo);

    int updateByExampleSelective(@Param("record") FbOrder record, @Param("example") FbOrderExample example);

    int updateByExample(@Param("record") FbOrder record, @Param("example") FbOrderExample example);

    int updateByPrimaryKeySelective(FbOrder record);

    int updateByPrimaryKey(FbOrder record);
}