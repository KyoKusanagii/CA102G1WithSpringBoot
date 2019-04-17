package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Live;
import com.ca102g1.springboot.model.LiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveMapper {
    int countByExample(LiveExample example);

    int deleteByExample(LiveExample example);

    int deleteByPrimaryKey(String liveNo);

    int insert(Live record);

    int insertSelective(Live record);

    List<Live> selectByExample(LiveExample example);

    Live selectByPrimaryKey(String liveNo);

    int updateByExampleSelective(@Param("record") Live record, @Param("example") LiveExample example);

    int updateByExample(@Param("record") Live record, @Param("example") LiveExample example);

    int updateByPrimaryKeySelective(Live record);

    int updateByPrimaryKey(Live record);
}