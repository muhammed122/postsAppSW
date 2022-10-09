package com.example.postsapiappsw.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.postsapiappsw.R;
import com.example.postsapiappsw.data.model.user.CommentResponseItem;
import com.example.postsapiappsw.data.model.PostResponseItem;
import com.example.postsapiappsw.data.source.remote.RetrofitClient;
import com.example.postsapiappsw.databinding.FragmentPostDetailsBinding;
import com.example.postsapiappsw.ui.adapter.CommentAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PostDetailsFragment extends Fragment {


    private FragmentPostDetailsBinding binding;

    private CommentAdapter commentAdapter;


    public PostDetailsFragment() {
        // Required empty public constructor
    }


    private void fetchPost(int postId) {
        RetrofitClient.getWebService()
                .getPost(postId)
                .enqueue(new Callback<PostResponseItem>() {
                    @Override
                    public void onResponse(Call<PostResponseItem> call, Response<PostResponseItem> response) {
                        Log.d("ddddddd", "onResponse: " + response.body());

                        if (response.isSuccessful())
                            initUI(response.body());
                    }

                    @Override
                    public void onFailure(Call<PostResponseItem> call, Throwable t) {
                        Toast.makeText(requireContext(), "" + t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void fetchPostComments(int postId) {
        RetrofitClient.getWebService()
                .getPostComments(postId)
                .enqueue(new Callback<List<CommentResponseItem>>() {
                    @Override
                    public void onResponse(Call<List<CommentResponseItem>> call, Response<List<CommentResponseItem>> response) {
                        if (response.isSuccessful())
                            commentAdapter.addComemnts(response.body());
                    }

                    @Override
                    public void onFailure(Call<List<CommentResponseItem>> call, Throwable t) {

                    }
                });
    }

    PostResponseItem post;

    private void initCommentRecycler() {
        commentAdapter = new CommentAdapter();
        binding.commentRecycler.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.commentRecycler.setAdapter(commentAdapter);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        post = PostDetailsFragmentArgs.fromBundle(getArguments())
                .getPost();

        fetchPostComments(post.getId());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentPostDetailsBinding.bind(view);
        initUI(post);
        initCommentRecycler();

    }

    private void initUI(PostResponseItem post) {

        binding.txtPostId.setText(String.valueOf(post.getId()));
        binding.txtUserId.setText(String.valueOf(post.getUserId()));
        binding.txtPostDesc.setText(post.getBody());
        binding.txtPostTitle.setText(post.getTitle());

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}