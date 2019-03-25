package com.pet.mapper;

import com.pet.po.Pet;
import com.pet.po.PetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetMapper {
    int countByExample(PetExample example);

    int deleteByExample(PetExample example);

    int deleteByPrimaryKey(String petId);

    int insert(Pet record);

    int insertSelective(Pet record);

    List<Pet> selectByExample(PetExample example);

    Pet selectByPrimaryKey(String petId);

    int updateByExampleSelective(@Param("record") Pet record, @Param("example") PetExample example);

    int updateByExample(@Param("record") Pet record, @Param("example") PetExample example);

    int updateByPrimaryKeySelective(Pet record);

    int updateByPrimaryKey(Pet record);
}