package com.NFA.NgalaKiambote.db_conection;

import com.NFA.NgalaKiambote.models.Model_User;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("RegisterUser.php")
    Call<Model_User>registerUser(
            @Field("name") String name,

            @Field("password") String password,

            @Field("type_user") String type_user,

            @Field("image") String image,

            @Field("email") String email,

            @Field("status") String status,

            @Field("weight") double weight,

            @Field("height") double height,

            @Field("bodyTemperature") int bodyTemperature,

            @Field("hearthBeat") int hearthBeat
    );
}
