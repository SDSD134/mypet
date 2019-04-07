package com.pet.dao;

import com.pet.mapper.ArticleMapper;
import com.pet.mapper.UserMapper;
import com.pet.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserVoMapper extends UserMapper{
    int checkUserName(String username);
    int checkPassword(String password);
    int checkPhone(String phone);
    User login (@Param("phone") String pohone, @Param("password") String passwod);
    User selectByUserName(String username);

}
