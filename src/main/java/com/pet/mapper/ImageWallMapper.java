package com.pet.mapper;

import com.pet.pojo.ImageWall;
import com.pet.pojo.ImageWallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageWallMapper {
    int countByExample(ImageWallExample example);

    int deleteByExample(ImageWallExample example);

    int deleteByPrimaryKey(String imageId);

    int insert(ImageWall record);

    int insertSelective(ImageWall record);

    List<ImageWall> selectByExample(ImageWallExample example);

    ImageWall selectByPrimaryKey(String imageId);

    int updateByExampleSelective(@Param("record") ImageWall record, @Param("example") ImageWallExample example);

    int updateByExample(@Param("record") ImageWall record, @Param("example") ImageWallExample example);

    int updateByPrimaryKeySelective(ImageWall record);

    int updateByPrimaryKey(ImageWall record);
}