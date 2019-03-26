package com.pet.pojo;

import java.util.Date;

public class ImageWall {
    private Integer imageId;

    private Integer userId;

    private String imamgeUrl;

    private String imageTitle;

    private Date createTime;

    private Date updateTime;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImamgeUrl() {
        return imamgeUrl;
    }

    public void setImamgeUrl(String imamgeUrl) {
        this.imamgeUrl = imamgeUrl == null ? null : imamgeUrl.trim();
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle == null ? null : imageTitle.trim();
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
}