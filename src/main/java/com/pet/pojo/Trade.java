package com.pet.pojo;

import java.util.Date;

public class Trade {
    private Integer tradeId;

    private String tradePrice;

    private Integer tradeType;

    private String tradeDes;

    private String tradeTitile;

    private Integer tradeStatus;

    private String tradeImage;

    private String traeAddress;

    private Integer userId;

    private Date createTime;

    private Date updateTime;

    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(String tradePrice) {
        this.tradePrice = tradePrice == null ? null : tradePrice.trim();
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeDes() {
        return tradeDes;
    }

    public void setTradeDes(String tradeDes) {
        this.tradeDes = tradeDes == null ? null : tradeDes.trim();
    }

    public String getTradeTitile() {
        return tradeTitile;
    }

    public void setTradeTitile(String tradeTitile) {
        this.tradeTitile = tradeTitile == null ? null : tradeTitile.trim();
    }

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getTradeImage() {
        return tradeImage;
    }

    public void setTradeImage(String tradeImage) {
        this.tradeImage = tradeImage == null ? null : tradeImage.trim();
    }

    public String getTraeAddress() {
        return traeAddress;
    }

    public void setTraeAddress(String traeAddress) {
        this.traeAddress = traeAddress == null ? null : traeAddress.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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