package com.example.soundlife.database;

public class BaseResponse <T>{
    public int status = 1;
    public String message = "success";
    public T data;

    public BaseResponse(T data) {
        this.data = data;
    }
}
