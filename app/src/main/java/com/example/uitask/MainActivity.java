package com.example.uitask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import org.w3c.dom.Comment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Comment> commentList;
    private RecyclerView recyclerView;
    private CommentAdapter commentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton commentButton = findViewById(R.id.commentButton);
        ImageButton likeButton = findViewById(R.id.likeButton);
        ImageButton shareButton = findViewById(R.id.shareButton);

        // Initialize the comment list
        commentList = new ArrayList<>();

        // Set up RecyclerView and adapter
        recyclerView = findViewById(R.id.recyclerView);
        commentAdapter = new CommentAdapter(commentList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(commentAdapter);

        // Set click listeners for the buttons
        commentButton.setOnClickListener(v -> {
            // Handle comment button click
        });

        likeButton.setOnClickListener(v -> {
            // Handle like button click
        });

        shareButton.setOnClickListener(v -> {
            // Handle share button click
        });

    }
}