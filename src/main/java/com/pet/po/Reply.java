package com.pet.po;

import java.util.Date;

public class Reply {
    private String replyId;

    private String commentId;

    private String repltText;

    private String replyUserId;

    private String commentUserId;

    private Date creatimeTime;

    private Date updateTime;

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getRepltText() {
        return repltText;
    }

    public void setRepltText(String repltText) {
        this.repltText = repltText == null ? null : repltText.trim();
    }

    public String getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(String replyUserId) {
        this.replyUserId = replyUserId == null ? null : replyUserId.trim();
    }

    public String getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId == null ? null : commentUserId.trim();
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