package com.example.uitask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;

import org.w3c.dom.Comment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Comment> commentList = new ArrayList<>();;
    private RecyclerView recyclerView;
    private CommentsAdapter commentsAdapter;
    private CommentsViewModel commentsViewModel;
    private ViewModelProvider viewModelProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModelProvider = new ViewModelProvider(this);

        ImageButton commentButton = findViewById(R.id.commentButton);
        ImageButton likeButton = findViewById(R.id.likeButton);
        ImageButton shareButton = findViewById(R.id.shareButton);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        commentsAdapter = new CommentsAdapter(commentList);
        recyclerView.setAdapter(commentsAdapter);


        commentsViewModel = viewModelProvider.get(CommentsViewModel.class);
        commentsViewModel.getComments().observe(this, comments -> {
            commentsAdapter.setComments();
        });


        // Set click listeners for the buttons
        commentButton.setOnClickListener(v -> { });

        likeButton.setOnClickListener(v -> { });

        shareButton.setOnClickListener(v -> { });

    }
}