package com.example.retrofit_example;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface ApiInterface {

    @FormUrlEncoded // annotation used in POST type requests
    @POST("/retrofit/add_data.php")     // API's endpoints
    public void registration(@Field("name") String name,
                             @Field("email") String email,
                             @Field("password") String password,
                             @Field("logintype") String logintype,
                             Callback<SignUpResponse> callback);
}