package com.sam.notes;

import android.app.Application;

import java.util.Date;


// I CANNOT INSTALL REALM  why the hell is that? I've tried everything


public class Notes {


    String title;
    String text;
    Date createdAt;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
