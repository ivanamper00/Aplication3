package com.mukangulol.application3.database;

import com.mukangulol.application3.model.EventsModel;
import com.mukangulol.application3.model.LiveScoreModel;
import com.mukangulol.application3.model.TeamsModel;
import com.mukangulol.application3.model.UpcomingModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LiveScoreApi {
    String BASE_URL = "https://www.scorebat.com/video-api/";


    @GET("v1")
    Call<List<LiveScoreModel>> getLiveGames();
}
