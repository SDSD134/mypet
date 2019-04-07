package com.pet.service;

import com.pet.common.ServerResponse;
import com.pet.pojo.Article;

import javax.servlet.http.HttpSession;

public interface CommunityService {
    ServerResponse<String> writeArticle( String username, Article article, HttpSession session);
    ServerResponse<String> addArticleImage(String img_url,String articleId);
    ServerResponse<String> writeComment(String articleId,String comment,String username);
}
