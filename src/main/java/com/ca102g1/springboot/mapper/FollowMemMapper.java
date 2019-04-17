package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.FollowMem;
import com.ca102g1.springboot.model.FollowMemExample;
import com.ca102g1.springboot.model.FollowMemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowMemMapper {
    int countByExample(FollowMemExample example);

    int deleteByExample(FollowMemExample example);

    int deleteByPrimaryKey(FollowMemKey key);

    int insert(FollowMem record);

    int insertSelective(FollowMem record);

    List<FollowMem> selectByExample(FollowMemExample example);

    FollowMem selectByPrimaryKey(FollowMemKey key);

    int updateByExampleSelective(@Param("record") FollowMem record, @Param("example") FollowMemExample example);

    int updateByExample(@Param("record") FollowMem record, @Param("example") FollowMemExample example);

    int updateByPrimaryKeySelective(FollowMem record);

    int updateByPrimaryKey(FollowMem record);
}