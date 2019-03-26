package com.pet.mapper;

import com.pet.pojo.ImageWall;
import com.pet.pojo.ImageWallExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageWallMapper {
    int countByExample(ImageWallExample example);

    int deleteByExample(ImageWallExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(ImageWall record);

    int insertSelective(ImageWall record);

    List<ImageWall> selectByExample(ImageWallExample example);

    ImageWall selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") ImageWall record, @Param("example") ImageWallExample example);

    int updateByExample(@Param("record") ImageWall record, @Param("example") ImageWallExample example);

    int updateByPrimaryKeySelective(ImageWall record);

    int updateByPrimaryKey(ImageWall record);
}