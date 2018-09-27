package com.kashdevelopment.development.kashmirstudentportal.managers.listeners;

import com.kashdevelopment.development.kashmirstudentportal.model.PostListResult;

public interface OnPostListChangedListener<Post> {

    public void onListChanged(PostListResult result);

    void onCanceled(String message);
}
