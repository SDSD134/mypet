package com.pet.service.impl;

import com.pet.common.ServerResponse;
import com.pet.mapper.UserMapper;
import com.pet.mapper.ArticleMapper;
import com.pet.pojo.Article;
import com.pet.pojo.User;
import com.pet.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private UserMapper userMapper;


   public ServerResponse<String> writeArticle( String username, Article article,
                                        HttpSession session) {
        Integer count = userMapper.checkUserName(username);
        if (count == null) {
            return ServerResponse.createByErrorMessage("没有这个用户");
        }
        User user = userMapper.selectByUserName(username);
        article.setUserId(user.getUserId());
        Integer result =articleMapper.insert(article);
        if (result ==null) {
            return ServerResponse.createByErrorMessage("创建帖子失败");
        }
        return ServerResponse.createBySuccessMessage("创建成功");
    }

    public ServerResponse<String> addArticleImage(String img_url, String articleId) {
        int id = Integer.parseInt(articleId);
        return null;
    }

    @Override
    public ServerResponse<String> writeComment(String articleId, String comment, String username) {
        return null;
    }
}
