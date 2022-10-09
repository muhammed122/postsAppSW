package com.example.postsapiappsw.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.postsapiappsw.data.model.PostResponseItem;
import com.example.postsapiappsw.databinding.ItemPostLayoutBinding;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostHolder> {

    private List<PostResponseItem> posts;
    private PostAction postAction;

    public PostsAdapter(PostAction postAction) {
        this.postAction = postAction;
    }


    public void addPosts(List<PostResponseItem> posts) {
        this.posts = posts;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPostLayoutBinding binding =
                ItemPostLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new PostHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PostHolder holder, int position) {
        PostResponseItem post = posts.get(position);
        holder.binding.txtPostId.setText(String.valueOf(post.getId()));
        holder.binding.txtPostTitle.setText(post.getTitle());
    }

    @Override
    public int getItemCount() {
        if (posts != null)
            return posts.size();
        return 0;
    }


    class PostHolder extends RecyclerView.ViewHolder {
        ItemPostLayoutBinding binding;

        public PostHolder(@NonNull ItemPostLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    postAction.postClick(posts.get(getLayoutPosition()));
                }
            });

        }
    }


   public interface PostAction {
        public void postClick(PostResponseItem post);
    }

}
