package com.pet.service.impl;

import com.pet.common.ServerResponse;
import com.pet.dao.UserVoMapper;
import com.pet.mapper.ArticleMapper;
import com.pet.pojo.Article;
import com.pet.pojo.User;
import com.pet.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Service
public class CommunityServiceImpl implements CommunityService {
/*    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private UserVoMapper userVoMapper;*/


    private ServerResponse<String> writeArticle( String username, Article article,
                                                 HttpSession session) {

        User user = userVoMapper.selectByUserName(username);
        article.setUserId(user.getUserId());

        Object o = new Object();

        Integer result =articleMapper.insert(article);
        if (result ==null) {
            return ServerResponse.createByErrorMessage("创建帖子失败");
        }
        return ServerResponse.createBySuccessMessage("创建成功");
    }

/*    Integer count = userVoMapper.checkUserName(username);
        if (count == null) {
        return ServerResponse.createByErrorMessage("没有这个用户");
    }*/

    @Override
    public ServerResponse<String> writeArticle(String username, Article article, HttpSession session) {
        return null;
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
