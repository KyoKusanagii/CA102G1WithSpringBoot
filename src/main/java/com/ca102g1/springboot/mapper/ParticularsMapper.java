package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Particulars;
import com.ca102g1.springboot.model.ParticularsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParticularsMapper {
    int countByExample(ParticularsExample example);

    int deleteByExample(ParticularsExample example);

    int deleteByPrimaryKey(Long partNo);

    int insert(Particulars record);

    int insertSelective(Particulars record);

    List<Particulars> selectByExample(ParticularsExample example);

    Particulars selectByPrimaryKey(Long partNo);

    int updateByExampleSelective(@Param("record") Particulars record, @Param("example") ParticularsExample example);

    int updateByExample(@Param("record") Particulars record, @Param("example") ParticularsExample example);

    int updateByPrimaryKeySelective(Particulars record);

    int updateByPrimaryKey(Particulars record);
}