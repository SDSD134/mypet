package com.pet.common;

public class Const {
    public static final String CURRENT_USER = "currentUser";

    public interface Role {
        int ROLE_CUSTOMER = 0;  //普通用户
        int ROLE_ADMIN = 1;    //管理员
        int ROLE_DOCTOR = 2;    //宠物医生
        int ROLE_SALE = 3;      //卖家

    }
}
