package com.example.thechairsmaticprimaryschool;

public class Note {

    private String title = null;
    private String description = null;
    private String username = null;
    private int id;

    public Note() {
        this.title = title;
        this.description = description;
        this.username = username;
    }

    public Note(String title, String description, String username) {

        this.title = title;
        this.description = description;
        this.username = username;
    }

    public int getId() {
        int id = 0;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

