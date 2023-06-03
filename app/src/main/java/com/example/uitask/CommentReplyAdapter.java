package com.example.uitask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CommentReplyAdapter extends RecyclerView.Adapter<CommentReplyAdapter.ViewHolder> {
    private List<CommentReply> replyList;

    public CommentReplyAdapter(List<CommentReply> replyList) {
        this.replyList = replyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_item, parent, false);
        return new ViewHolder(view);
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CommentReply reply = replyList.get(position);
//        holder.usernameTextView.setText(reply.getUsername());
//        holder.replyTextView.setText(reply.getText());
    }

    @Override
    public int getItemCount() {
        return replyList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        public TextView usernameTextView;
//        public TextView replyTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            usernameTextView = itemView.findViewById(R.id.usernameTextView);
//            replyTextView = itemView.findViewById(R.id.replyTextView);
        }
    }
}

