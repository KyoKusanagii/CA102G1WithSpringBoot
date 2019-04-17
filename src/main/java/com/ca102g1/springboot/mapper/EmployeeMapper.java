package com.ca102g1.springboot.mapper;

import com.ca102g1.springboot.model.Employee;
import com.ca102g1.springboot.model.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String empNo);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExampleWithBLOBs(EmployeeExample example);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(String empNo);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExampleWithBLOBs(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKeyWithBLOBs(Employee record);

    int updateByPrimaryKey(Employee record);
}