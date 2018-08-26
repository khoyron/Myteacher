package com.cekongkir.cekpaket.cekresi.ceklokasi.ceksemuaongkir.cekbarang.kiriman.khoiron.Utility

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by khoiron on 19/01/18.
 */
interface MyUrl {


    @POST("register")
    abstract fun register(@Field("first_name")firtName :String,
                          @Field("last_name")last_name :String,
                          @Field("address")address :String,
                          @Field("zip_code")zip_code :String,
                          @Field("user_name")user_name :String,
                          @Field("pasword")pasword :String,
                          @Field("email")email :String,
                          @Field("mobile")mobile :String,
                          @Field("gender")gender :String,
                          @Field("timestamps")timestamps :String,
                          @Field("tipe")tipe :String):Call<ResponseBody>

    @POST("login")
    abstract fun login(@Field("email")email :String,
                       @Field("password")password :String): Call<ResponseBody>

    @POST("login-google")
    abstract fun loginGoogle(@Field("email")email: String): Call<ResponseBody>

    @POST("login-facebook")
    abstract fun loginFacebook(@Header("email")email: String):Call<ResponseBody>

    @GET("getuser")
    abstract fun getUser(@Header("Authorization")token :String,
                         @Field("id")id :String):Call<ResponseBody>

}
