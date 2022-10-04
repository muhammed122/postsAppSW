package com.example.postsapiappsw.data.source.remote;

import com.example.postsapiappsw.data.model.PostResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WebService {
    @GET("posts")
    Call<PostResponse> getPosts();
}
