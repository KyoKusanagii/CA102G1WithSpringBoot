package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Chat;
import com.ca102g1.springboot.model.ChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatMapper {
    int countByExample(ChatExample example);

    int deleteByExample(ChatExample example);

    int insert(Chat record);

    int insertSelective(Chat record);

    List<Chat> selectByExample(ChatExample example);

    int updateByExampleSelective(@Param("record") Chat record, @Param("example") ChatExample example);

    int updateByExample(@Param("record") Chat record, @Param("example") ChatExample example);
}