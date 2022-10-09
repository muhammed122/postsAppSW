package com.example.postsapiappsw.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.postsapiappsw.R;
import com.example.postsapiappsw.data.model.PostResponseItem;
import com.example.postsapiappsw.data.model.user.UserResponse;
import com.example.postsapiappsw.data.source.remote.RetrofitClient;
import com.example.postsapiappsw.databinding.FragmentPostsBinding;
import com.example.postsapiappsw.ui.adapter.PostsAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostsFragment extends Fragment implements PostsAdapter.PostAction {

    private FragmentPostsBinding binding;
    private PostsAdapter postsAdapter;


    private void initRecyclerView() {
        postsAdapter = new PostsAdapter(this);
        binding.postsRecycler.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.postsRecycler.setAdapter(postsAdapter);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_posts, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentPostsBinding.bind(view);
        initRecyclerView();
        //  fetchPosts();
        loginTestMethod();


    }

    private void loginTestMethod() {
        RetrofitClient.getWebService()
                .testLogin("user10@app.com", "password")
                .enqueue(new Callback<UserResponse>() {
                    @Override
                    public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                        Log.d("dddddddd", "onResponse: " + response.body());
                    }

                    @Override
                    public void onFailure(Call<UserResponse> call, Throwable t) {
                        Log.d("ddddddddd", "onFailure: " + t.getLocalizedMessage());
                    }
                });
    }

    private void fetchPosts() {
        RetrofitClient.getWebService()
                .getPosts().enqueue(new Callback<List<PostResponseItem>>() {
                    @Override
                    public void onResponse(Call<List<PostResponseItem>> call, Response<List<PostResponseItem>> response) {

                        Log.d("tttttt", "onResponse: " + response.body());
                        if (response.isSuccessful())
                            postsAdapter.addPosts(response.body());


                    }

                    @Override
                    public void onFailure(Call<List<PostResponseItem>> call, Throwable t) {
                        Log.d("ttttttt", "onFailure: " + t.getLocalizedMessage());

                    }
                });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void postClick(PostResponseItem post) {
        Navigation.findNavController(getView())
                .navigate(PostsFragmentDirections
                        .actionPostsFragmentToPostDetailsFragment(post));
    }
}