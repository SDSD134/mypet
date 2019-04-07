package com.pet.mapper;

import com.pet.pojo.ImageAll;
import com.pet.pojo.ImageAllExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageAllMapper {
    int countByExample(ImageAllExample example);

    int deleteByExample(ImageAllExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImageAll record);

    int insertSelective(ImageAll record);

    List<ImageAll> selectByExample(ImageAllExample example);

    ImageAll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImageAll record, @Param("example") ImageAllExample example);

    int updateByExample(@Param("record") ImageAll record, @Param("example") ImageAllExample example);

    int updateByPrimaryKeySelective(ImageAll record);

    int updateByPrimaryKey(ImageAll record);
}