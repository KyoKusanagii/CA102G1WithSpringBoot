package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.ArticleReport;
import com.ca102g1.springboot.model.ArticleReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleReportMapper {
    int countByExample(ArticleReportExample example);

    int deleteByExample(ArticleReportExample example);

    int deleteByPrimaryKey(String articleReportNo);

    int insert(ArticleReport record);

    int insertSelective(ArticleReport record);

    List<ArticleReport> selectByExample(ArticleReportExample example);

    ArticleReport selectByPrimaryKey(String articleReportNo);

    int updateByExampleSelective(@Param("record") ArticleReport record, @Param("example") ArticleReportExample example);

    int updateByExample(@Param("record") ArticleReport record, @Param("example") ArticleReportExample example);

    int updateByPrimaryKeySelective(ArticleReport record);

    int updateByPrimaryKey(ArticleReport record);
}