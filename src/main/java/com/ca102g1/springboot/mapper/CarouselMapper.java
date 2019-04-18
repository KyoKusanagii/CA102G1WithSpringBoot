package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Carousel;
import com.ca102g1.springboot.model.CarouselExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarouselMapper {
    int countByExample(CarouselExample example);

    int deleteByExample(CarouselExample example);

    int deleteByPrimaryKey(Integer carouselNo);

    int insert(Carousel record);

    int insertSelective(Carousel record);

    List<Carousel> selectByExampleWithBLOBs(CarouselExample example);

    List<Carousel> selectByExample(CarouselExample example);

    Carousel selectByPrimaryKey(Integer carouselNo);

    int updateByExampleSelective(@Param("record") Carousel record, @Param("example") CarouselExample example);

    int updateByExampleWithBLOBs(@Param("record") Carousel record, @Param("example") CarouselExample example);

    int updateByExample(@Param("record") Carousel record, @Param("example") CarouselExample example);

    int updateByPrimaryKeySelective(Carousel record);

    int updateByPrimaryKeyWithBLOBs(Carousel record);

    int updateByPrimaryKey(Carousel record);
}