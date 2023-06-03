package com.example.uitask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class CommentsViewModel extends ViewModel {
    private MutableLiveData<List<CommentsModel>> commentsLiveData;

    public LiveData<List<CommentsModel>> getComments() {
        if (commentsLiveData == null) {
            commentsLiveData = new MutableLiveData<>();
            loadComments();
        }
        return commentsLiveData;
    }

    private void loadComments() {
        List<CommentsModel> comments = new ArrayList<>();
        comments.add(new CommentsModel("profile_photo_1", "user1", "Comment 1", "10"));
        comments.add(new CommentsModel("profile_photo_2", "user2", "Comment 2", "5"));
        comments.add(new CommentsModel("profile_photo_3", "user3", "Comment 3", "3"));

        commentsLiveData.setValue(comments);
    }

    public void addComment(CommentsModel comment) {
        List<CommentsModel> comments = commentsLiveData.getValue();
        if (comments != null) {
            comments.add(comment);
            commentsLiveData.setValue(comments);
        }
    }
}

