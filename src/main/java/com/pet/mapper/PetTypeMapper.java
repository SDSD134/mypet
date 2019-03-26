package com.pet.mapper;

import com.pet.pojo.PetType;
import com.pet.pojo.PetTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetTypeMapper {
    int countByExample(PetTypeExample example);

    int deleteByExample(PetTypeExample example);

    int deleteByPrimaryKey(String typeId);

    int insert(PetType record);

    int insertSelective(PetType record);

    List<PetType> selectByExample(PetTypeExample example);

    PetType selectByPrimaryKey(String typeId);

    int updateByExampleSelective(@Param("record") PetType record, @Param("example") PetTypeExample example);

    int updateByExample(@Param("record") PetType record, @Param("example") PetTypeExample example);

    int updateByPrimaryKeySelective(PetType record);

    int updateByPrimaryKey(PetType record);
}