package com.kashdevelopment.development.kashmirstudentportal.managers.listeners;

import com.kashdevelopment.development.kashmirstudentportal.model.Post;

public interface OnPostChangedListener {
    public void onObjectChanged(Post obj);

    public void onError(String errorText);
}
