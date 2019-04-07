package com.pet.controller;

import com.pet.common.ServerResponse;
import com.pet.dao.UserVoMapper;
import com.pet.mapper.ArticleMapper;
import com.pet.mapper.UserMapper;
import com.pet.pojo.Article;
import com.pet.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("community")
public class CommunityController {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private UserVoMapper userVoMapper;

    @RequestMapping("/writeArticle")
    private ServerResponse writeArticle(@RequestParam(value = "username") String username, Article article,
                                        HttpSession session) {
       Integer count = userVoMapper.checkUserName(username);
       if (count == null) {
           return ServerResponse.createByErrorMessage("没有这个用户");
       }
        User user = userVoMapper.selectByUserName(username);
       article.setUserId(user.getUserId());
       Integer result =articleMapper.insert(article);
       if (result ==null) {
           return ServerResponse.createByErrorMessage("创建帖子失败");
       }
       return ServerResponse.createBySuccessMessage("创建成功");
    }

    private ServerResponse addArticleImage(String img_url,String articleId) {
        int id = Integer.parseInt(articleId);
        return null;
    }
}
