package com.pet.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
/**
 * Created by geely
 */

//保证序列化json的时候,如果是null的对象,key也会消失
@ApiModel(value = "ServerResponse",description ="返回数据与调用状态及调用接口消息" )
public class ServerResponse<T> implements Serializable {

    @ApiParam(name="status",value="接口调用状态码")
    private int status;   //接口调用状态码
    @ApiParam(name="msg",value="接口调用后返回的消息")
    private String msg;   //接口需要相应的消息
    @ApiParam(name="data",value = "接口调用后返回的数据")
    private T data;  //泛型返回值


    //私有构造方法  外部不能new  开放供外部使用的public方法
    private ServerResponse(int status){
        this.status = status;
    }


    private ServerResponse(int status,T data){
        this.status = status;
        this.data = data;
    }

    private ServerResponse(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private ServerResponse(int status,String msg){
        this.status = status;
        this.msg = msg;
    }


    //使之不在json序列化结果当中
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }//

    public int getStatus(){
        return status;
    }

    public T getDate(){
        return data;
    }

    public String getMsg(){
        return msg;
    }

    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> createBySuccessMessage(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> ServerResponse<T> createBySuccess(String msg,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }


    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }


    public static <T> ServerResponse<T> createByErrorMessage(String errorMessage){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode,String errorMessage){
        return new ServerResponse<T>(errorCode,errorMessage);
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

