package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.FollowItem;
import com.ca102g1.springboot.model.FollowItemExample;
import com.ca102g1.springboot.model.FollowItemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowItemMapper {
    int countByExample(FollowItemExample example);

    int deleteByExample(FollowItemExample example);

    int deleteByPrimaryKey(FollowItemKey key);

    int insert(FollowItem record);

    int insertSelective(FollowItem record);

    List<FollowItem> selectByExample(FollowItemExample example);

    FollowItem selectByPrimaryKey(FollowItemKey key);

    int updateByExampleSelective(@Param("record") FollowItem record, @Param("example") FollowItemExample example);

    int updateByExample(@Param("record") FollowItem record, @Param("example") FollowItemExample example);

    int updateByPrimaryKeySelective(FollowItem record);

    int updateByPrimaryKey(FollowItem record);
}