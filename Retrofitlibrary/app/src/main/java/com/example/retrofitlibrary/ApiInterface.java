package com.example.retrofitlibrary;



import android.telecom.Call;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;





public interface ApiInterface {

    @FormUrlEncoded // annotation used in POST type requests
    @POST("/retrofit/register.php")
        // API's endpoints
    Call<SignUpResponse> registration(@Field("name") String name,
                                      @Field("email") String email,
                                      @Field("password") String password,
                                      @Field("logintype") String logintype);

    // In registration method @Field used to set the keys and String data type is representing its a string type value and callback is used to get the response from api and it will set it in our POJO class
}
