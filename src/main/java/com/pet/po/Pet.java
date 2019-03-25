package com.pet.po;

import java.util.Date;

public class Pet {
    private String petId;

    private String petName;

    private String petTypeId;

    private String petImage;

    private String petDescription;

    private Date createTime;

    private Date updateTime;

    private String userId;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId == null ? null : petId.trim();
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    public String getPetTypeId() {
        return petTypeId;
    }

    public void setPetTypeId(String petTypeId) {
        this.petTypeId = petTypeId == null ? null : petTypeId.trim();
    }

    public String getPetImage() {
        return petImage;
    }

    public void setPetImage(String petImage) {
        this.petImage = petImage == null ? null : petImage.trim();
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription == null ? null : petDescription.trim();
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}