package com.example.postsapiappsw.data.source.remote;

import com.example.postsapiappsw.data.model.user.CommentResponseItem;
import com.example.postsapiappsw.data.model.PostResponseItem;
import com.example.postsapiappsw.data.model.user.UserResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WebService {


    @GET("posts")
    Call<List<PostResponseItem>> getPosts();

    @GET("posts/{id}")
    Call<PostResponseItem> getPost(@Path("id") int id);

    @GET("comments")
    Call<List<CommentResponseItem>> getPostComments(@Query("postId")
                                                            int postId);

    @POST("api/login")
    @FormUrlEncoded
    Call<UserResponse> testLogin(@Field("email") String email,
                                 @Field("password") String password);

}
