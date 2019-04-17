package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.LimitSale;
import com.ca102g1.springboot.model.LimitSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LimitSaleMapper {
    int countByExample(LimitSaleExample example);

    int deleteByExample(LimitSaleExample example);

    int deleteByPrimaryKey(Long saleNo);

    int insert(LimitSale record);

    int insertSelective(LimitSale record);

    List<LimitSale> selectByExample(LimitSaleExample example);

    LimitSale selectByPrimaryKey(Long saleNo);

    int updateByExampleSelective(@Param("record") LimitSale record, @Param("example") LimitSaleExample example);

    int updateByExample(@Param("record") LimitSale record, @Param("example") LimitSaleExample example);

    int updateByPrimaryKeySelective(LimitSale record);

    int updateByPrimaryKey(LimitSale record);
}