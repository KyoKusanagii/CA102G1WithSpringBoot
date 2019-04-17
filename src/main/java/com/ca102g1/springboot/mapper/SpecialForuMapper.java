package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.SpecialForu;
import com.ca102g1.springboot.model.SpecialForuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialForuMapper {
    int countByExample(SpecialForuExample example);

    int deleteByExample(SpecialForuExample example);

    int deleteByPrimaryKey(String memNo);

    int insert(SpecialForu record);

    int insertSelective(SpecialForu record);

    List<SpecialForu> selectByExample(SpecialForuExample example);

    SpecialForu selectByPrimaryKey(String memNo);

    int updateByExampleSelective(@Param("record") SpecialForu record, @Param("example") SpecialForuExample example);

    int updateByExample(@Param("record") SpecialForu record, @Param("example") SpecialForuExample example);

    int updateByPrimaryKeySelective(SpecialForu record);

    int updateByPrimaryKey(SpecialForu record);
}