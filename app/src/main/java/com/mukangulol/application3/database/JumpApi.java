package com.mukangulol.application3.database;

import com.mukangulol.application3.model.JumpModel;
import com.mukangulol.application3.model.LiveScoreModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JumpApi {

    String BASE_URL = "https://tindahans.com/";


    @GET("jump_code.php")
    Call<JumpModel> getJump();
}


