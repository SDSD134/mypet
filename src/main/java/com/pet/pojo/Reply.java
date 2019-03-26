package com.pet.pojo;

import java.util.Date;

public class Reply {
    private Integer replyId;

    private Integer commentId;

    private String repltText;

    private Integer replyUserId;

    private Integer commentUserId;

    private Date creatimeTime;

    private Date updateTime;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getRepltText() {
        return repltText;
    }

    public void setRepltText(String repltText) {
        this.repltText = repltText == null ? null : repltText.trim();
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public Date getCreatimeTime() {
        return creatimeTime;
    }

    public void setCreatimeTime(Date creatimeTime) {
        this.creatimeTime = creatimeTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}