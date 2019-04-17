package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.TrailerNotifyExample;
import com.ca102g1.springboot.model.TrailerNotifyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrailerNotifyMapper {
    int countByExample(TrailerNotifyExample example);

    int deleteByExample(TrailerNotifyExample example);

    int deleteByPrimaryKey(TrailerNotifyKey key);

    int insert(TrailerNotifyKey record);

    int insertSelective(TrailerNotifyKey record);

    List<TrailerNotifyKey> selectByExample(TrailerNotifyExample example);

    int updateByExampleSelective(@Param("record") TrailerNotifyKey record, @Param("example") TrailerNotifyExample example);

    int updateByExample(@Param("record") TrailerNotifyKey record, @Param("example") TrailerNotifyExample example);
}