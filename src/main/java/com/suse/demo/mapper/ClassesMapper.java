package com.suse.demo.mapper;

import com.suse.demo.entity.Classes;
import com.suse.demo.entity.ClassesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassesMapper {
    long countByExample(ClassesExample example);

    int deleteByExample(ClassesExample example);

    int deleteByPrimaryKey(Integer classesId);

    int insert(Classes record);

    int insertSelective(Classes record);

    List<Classes> selectByExample(ClassesExample example);

    Classes selectByPrimaryKey(Integer classesId);

    int updateByExampleSelective(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByExample(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}