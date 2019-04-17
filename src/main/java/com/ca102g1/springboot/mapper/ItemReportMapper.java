package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.ItemReport;
import com.ca102g1.springboot.model.ItemReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemReportMapper {
    int countByExample(ItemReportExample example);

    int deleteByExample(ItemReportExample example);

    int deleteByPrimaryKey(String itemReportNo);

    int insert(ItemReport record);

    int insertSelective(ItemReport record);

    List<ItemReport> selectByExampleWithBLOBs(ItemReportExample example);

    List<ItemReport> selectByExample(ItemReportExample example);

    ItemReport selectByPrimaryKey(String itemReportNo);

    int updateByExampleSelective(@Param("record") ItemReport record, @Param("example") ItemReportExample example);

    int updateByExampleWithBLOBs(@Param("record") ItemReport record, @Param("example") ItemReportExample example);

    int updateByExample(@Param("record") ItemReport record, @Param("example") ItemReportExample example);

    int updateByPrimaryKeySelective(ItemReport record);

    int updateByPrimaryKeyWithBLOBs(ItemReport record);

    int updateByPrimaryKey(ItemReport record);
}