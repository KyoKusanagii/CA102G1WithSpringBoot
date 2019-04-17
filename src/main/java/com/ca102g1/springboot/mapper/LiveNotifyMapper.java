package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.LiveNotifyExample;
import com.ca102g1.springboot.model.LiveNotifyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveNotifyMapper {
    int countByExample(LiveNotifyExample example);

    int deleteByExample(LiveNotifyExample example);

    int deleteByPrimaryKey(LiveNotifyKey key);

    int insert(LiveNotifyKey record);

    int insertSelective(LiveNotifyKey record);

    List<LiveNotifyKey> selectByExample(LiveNotifyExample example);

    int updateByExampleSelective(@Param("record") LiveNotifyKey record, @Param("example") LiveNotifyExample example);

    int updateByExample(@Param("record") LiveNotifyKey record, @Param("example") LiveNotifyExample example);
}