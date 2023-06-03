package com.example.uitask;

public class CommentReply {
    private String username;
    private String text;

    public CommentReply(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }
}

