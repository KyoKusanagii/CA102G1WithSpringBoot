package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Itempic;
import com.ca102g1.springboot.model.ItempicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItempicMapper {
    int countByExample(ItempicExample example);

    int deleteByExample(ItempicExample example);

    int deleteByPrimaryKey(String itemPicNo);

    int insert(Itempic record);

    int insertSelective(Itempic record);

    List<Itempic> selectByExampleWithBLOBs(ItempicExample example);

    List<Itempic> selectByExample(ItempicExample example);

    Itempic selectByPrimaryKey(String itemPicNo);

    int updateByExampleSelective(@Param("record") Itempic record, @Param("example") ItempicExample example);

    int updateByExampleWithBLOBs(@Param("record") Itempic record, @Param("example") ItempicExample example);

    int updateByExample(@Param("record") Itempic record, @Param("example") ItempicExample example);

    int updateByPrimaryKeySelective(Itempic record);

    int updateByPrimaryKeyWithBLOBs(Itempic record);

    int updateByPrimaryKey(Itempic record);
}