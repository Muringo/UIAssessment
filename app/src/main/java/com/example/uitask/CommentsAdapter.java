package com.example.uitask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Comment;

import java.util.List;

class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.CommentsViewHolder> {
    private List<Comment> commentsList;

    public CommentsAdapter(List<Comment> commentsList) {
        this.commentsList = commentsList;
    }

    public void setComments() {
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CommentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_item, parent, false);
        return new CommentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentsViewHolder holder, int position) {
        CommentModel comment = (CommentModel) commentsList.get(position);
        holder.bind(comment);
    }

    @Override
    public int getItemCount() {
        return commentsList.size();
    }

    public class CommentsViewHolder extends RecyclerView.ViewHolder {
        private TextView usernameTextView;
        private TextView commentTextView;
        private ImageButton likeButton;

        public CommentsViewHolder(@NonNull View itemView) {
            super(itemView);
            usernameTextView = itemView.findViewById(R.id.usernameTextView);
            commentTextView = itemView.findViewById(R.id.commentTextView);
            likeButton = itemView.findViewById(R.id.likeButton);
        }

        public void bind(CommentModel comment) {
            usernameTextView.setText(comment.getUsername());
            commentTextView.setText(comment.getText());
            likeButton.callOnClick();
        }
    }
}
