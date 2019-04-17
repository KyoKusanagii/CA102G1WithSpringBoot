package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Consulter;
import com.ca102g1.springboot.model.ConsulterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsulterMapper {
    int countByExample(ConsulterExample example);

    int deleteByExample(ConsulterExample example);

    int insert(Consulter record);

    int insertSelective(Consulter record);

    List<Consulter> selectByExampleWithBLOBs(ConsulterExample example);

    List<Consulter> selectByExample(ConsulterExample example);

    int updateByExampleSelective(@Param("record") Consulter record, @Param("example") ConsulterExample example);

    int updateByExampleWithBLOBs(@Param("record") Consulter record, @Param("example") ConsulterExample example);

    int updateByExample(@Param("record") Consulter record, @Param("example") ConsulterExample example);
}