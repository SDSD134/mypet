package com.pet.mapper;


import com.pet.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    int checkUserName(String username);
    int checkPassword(String password);
    int checkPhone(String phone);
    User login (@Param("phone") String pohone, @Param("password") String passwod);
    User selectByUserName(String username);

    int insert(User user);

    int checkUsername(String userName);
}
