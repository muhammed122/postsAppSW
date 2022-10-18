package com.example.postsapiappsw.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.postsapiappsw.data.model.PostResponseItem;
import com.example.postsapiappsw.data.source.remote.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModel extends ViewModel {


    private MutableLiveData<List<PostResponseItem>> _postsLiveData = new MutableLiveData<>();
    public LiveData<List<PostResponseItem>> postsLiveData = _postsLiveData;


    private MutableLiveData<String> _messageLiveData = new MutableLiveData<>();
    public LiveData<String> messageLiveData = _messageLiveData;

    public void fetchPosts() {
        RetrofitClient.getWebService()
                .getPosts().enqueue(new Callback<List<PostResponseItem>>() {
                    @Override
                    public void onResponse(Call<List<PostResponseItem>> call, Response<List<PostResponseItem>> response) {
                        if (response.isSuccessful())
                            _postsLiveData.setValue(response.body());

                        Log.d("dddddddd", "onFailure: "+response.message());
                    }


                    @Override
                    public void onFailure(Call<List<PostResponseItem>> call, Throwable t) {
                        _messageLiveData.setValue(t.getLocalizedMessage());
                        Log.d("dddddddd", "onFailure: "+t.getLocalizedMessage());
                    }
                });

    }

}
