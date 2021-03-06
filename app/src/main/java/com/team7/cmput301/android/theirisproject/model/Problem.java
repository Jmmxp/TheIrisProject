/*
 * Copyright (c) Team 7, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package com.team7.cmput301.android.theirisproject.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.searchbox.annotations.JestId;

public class Problem {
    @JestId
    private String _id;

    private String title;
    private String user;
    private Date date;
    private RecordList records;
    private List<Comment> comments = new ArrayList<>();
    private String description;
    private List<BodyPhoto> bodyPhotos;

    public Problem(String title, String description, String user, RecordList records, List<BodyPhoto> bodyPhotos) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.records = records;
        this.bodyPhotos = bodyPhotos;
    }

    public Problem(String title, String description, String user) {
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public Problem() {

    }

    public RecordList getRecords() {
        return records;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public String getId() {
        return _id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return String.valueOf(this.date);
    }

    public String getDescription() {
        return this.description;
    }


    public String getUser() {return user;}

    public List<BodyPhoto> getBodyPhotos() {
        return bodyPhotos;
    }

    public List<RecordPhoto> getSlideShowInfo() {
        return null;
    }

}