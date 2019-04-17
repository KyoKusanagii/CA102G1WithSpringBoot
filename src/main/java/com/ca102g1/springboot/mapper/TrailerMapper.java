package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Trailer;
import com.ca102g1.springboot.model.TrailerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrailerMapper {
    int countByExample(TrailerExample example);

    int deleteByExample(TrailerExample example);

    int deleteByPrimaryKey(String trailerNo);

    int insert(Trailer record);

    int insertSelective(Trailer record);

    List<Trailer> selectByExample(TrailerExample example);

    Trailer selectByPrimaryKey(String trailerNo);

    int updateByExampleSelective(@Param("record") Trailer record, @Param("example") TrailerExample example);

    int updateByExample(@Param("record") Trailer record, @Param("example") TrailerExample example);

    int updateByPrimaryKeySelective(Trailer record);

    int updateByPrimaryKey(Trailer record);
}