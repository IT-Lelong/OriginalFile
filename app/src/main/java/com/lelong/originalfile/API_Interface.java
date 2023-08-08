package com.lelong.originalfile;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface API_Interface {
    @GET
    Call<List<JsonObject>> getData(@Url String url);
}
