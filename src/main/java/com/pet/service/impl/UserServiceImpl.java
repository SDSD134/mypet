package com.pet.service.impl;

import com.pet.common.ServerResponse;
import com.pet.mapper.UserMapper;
import com.pet.pojo.User;
import com.pet.service.UserService;
import com.pet.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public ServerResponse<User> login(String userName,String userPwd){
        int resultCount = userMapper.checkUsername(userName);
        if(resultCount == 0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        //todo 密码登录MD5
        String md5Password = MD5Util.MD5EncodeUtf8(userPwd);

        User user = userMapper.selectLogin(userName, md5Password);
        if(user==null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        user.setUserPwd(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登陆成功",user);
    }


    public ServerResponse<String> register(User user) {
        ServerResponse validResponse = this.checkValid(user.getUserPwd());
        if(!validResponse.isSuccess()){
            return validResponse;
        }

        user.setUserPwd(MD5Util.MD5EncodeUtf8(user.getUserPwd()));
        int resultCount = userMapper.insert(user);
        if(resultCount == 0){
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    public ServerResponse<String> checkValid(String userName){
        if (org.apache.commons.lang3.StringUtils.isNotBlank(userName)) {
            int resultCount = userMapper.checkUsername(userName);
            if(resultCount > 0){
                return ServerResponse.createByErrorMessage("用户名已存在");
            }
        }else{
            return ServerResponse.createByErrorMessage("参数错误");
        }
        return ServerResponse.createBySuccess("校验成功");


    }



}
