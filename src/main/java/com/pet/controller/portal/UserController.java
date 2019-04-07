package com.pet.controller.portal;

import com.pet.common.Const;
import com.pet.common.ServerResponse;
import com.pet.pojo.User;
import com.pet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String userName, String userPwd, HttpSession session){
        ServerResponse<User> response = userService.login(userName, userPwd);
        if ((response.isSuccess())){
            session.setAttribute(Const.CURRENT_USER,response.getDate());
        }
        return response;
    }

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(User user){
        return userService.register(user);
    }

    //返回给前端Ajax校验用户名
    @RequestMapping(value = "/check_valid", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkValid(String userName){
        return userService.checkValid(userName);
    }

    //获取登录用户信息
    @RequestMapping(value = "get_user_info.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> getUserInfo(HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user != null){
            return ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErrorMessage("用户未登录,无法获取当前用户的信息");
    }
    //密码提示问题的获取
    @RequestMapping(value = "forget_get_question.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetGetQuestion(String userName){
        return userService.selectQuestion(userName);
    }

    //答案
    @RequestMapping(value = "forget_check_answer",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetCheckAnswer(String userName,String question,String answer){
        return userService.checkAnswer(userName,question,answer);
    }

}
