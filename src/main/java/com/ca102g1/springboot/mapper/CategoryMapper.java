package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Category;
import com.ca102g1.springboot.model.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(Short catNo);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Short catNo);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}