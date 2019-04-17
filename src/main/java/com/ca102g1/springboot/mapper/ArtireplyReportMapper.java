package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.ArtireplyReport;
import com.ca102g1.springboot.model.ArtireplyReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtireplyReportMapper {
    int countByExample(ArtireplyReportExample example);

    int deleteByExample(ArtireplyReportExample example);

    int deleteByPrimaryKey(String artireplyReportNo);

    int insert(ArtireplyReport record);

    int insertSelective(ArtireplyReport record);

    List<ArtireplyReport> selectByExample(ArtireplyReportExample example);

    ArtireplyReport selectByPrimaryKey(String artireplyReportNo);

    int updateByExampleSelective(@Param("record") ArtireplyReport record, @Param("example") ArtireplyReportExample example);

    int updateByExample(@Param("record") ArtireplyReport record, @Param("example") ArtireplyReportExample example);

    int updateByPrimaryKeySelective(ArtireplyReport record);

    int updateByPrimaryKey(ArtireplyReport record);
}