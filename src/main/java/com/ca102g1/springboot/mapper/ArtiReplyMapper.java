package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.ArtiReply;
import com.ca102g1.springboot.model.ArtiReplyExample;
import com.ca102g1.springboot.model.ArtiReplyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtiReplyMapper {
    int countByExample(ArtiReplyExample example);

    int deleteByExample(ArtiReplyExample example);

    int deleteByPrimaryKey(ArtiReplyKey key);

    int insert(ArtiReply record);

    int insertSelective(ArtiReply record);

    List<ArtiReply> selectByExample(ArtiReplyExample example);

    ArtiReply selectByPrimaryKey(ArtiReplyKey key);

    int updateByExampleSelective(@Param("record") ArtiReply record, @Param("example") ArtiReplyExample example);

    int updateByExample(@Param("record") ArtiReply record, @Param("example") ArtiReplyExample example);

    int updateByPrimaryKeySelective(ArtiReply record);

    int updateByPrimaryKey(ArtiReply record);
}