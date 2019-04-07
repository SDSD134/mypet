package com.pet.service;

import com.pet.common.ServerResponse;
import com.pet.pojo.User;

public interface UserService {

    ServerResponse<User> login(String userName, String userPwd);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String userName);

    ServerResponse selectQuestion(String userName);

    ServerResponse<String> checkAnswer(String userName, String question, String answer);
}
