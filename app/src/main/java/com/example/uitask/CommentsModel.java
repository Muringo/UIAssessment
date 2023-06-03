package com.example.uitask;

import java.util.ArrayList;
import java.util.List;

public class CommentsModel {
    private String profilePhoto;
    private String username;
    private String text;
    private String likes;
    private List<CommentReply> replies;



    public CommentsModel(String profilePhoto, String username, String text, String likes) {
        this.profilePhoto = profilePhoto;
        this.username = username;
        this.text = text;
        this.likes = likes;
        this.replies = new ArrayList<>();

    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }

    public String getLikes() {
        return likes;
    }

    public List<CommentReply> getReplies() {
        return replies;
    }
}
