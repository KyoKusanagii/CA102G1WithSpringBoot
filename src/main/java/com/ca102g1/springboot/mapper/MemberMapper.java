package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Member;
import com.ca102g1.springboot.model.MemberExample;
import com.ca102g1.springboot.model.MemberWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(String memNo);

    int insert(MemberWithBLOBs record);

    int insertSelective(MemberWithBLOBs record);

    List<MemberWithBLOBs> selectByExampleWithBLOBs(MemberExample example);

    List<Member> selectByExample(MemberExample example);

    MemberWithBLOBs selectByPrimaryKey(String memNo);

    int updateByExampleSelective(@Param("record") MemberWithBLOBs record, @Param("example") MemberExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberWithBLOBs record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(MemberWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MemberWithBLOBs record);

    int updateByPrimaryKey(Member record);
}