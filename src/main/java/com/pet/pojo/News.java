package com.pet.pojo;

import java.util.Date;

public class News {
    private String newsId;

    private String newsTitle;

    private String newsDescriprion;

    private Date createTime;

    private Date updateTime;

    private String newsText;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsDescriprion() {
        return newsDescriprion;
    }

    public void setNewsDescriprion(String newsDescriprion) {
        this.newsDescriprion = newsDescriprion == null ? null : newsDescriprion.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText == null ? null : newsText.trim();
    }
}