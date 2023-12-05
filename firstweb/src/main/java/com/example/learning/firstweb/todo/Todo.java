package com.example.learning.firstweb.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    private String Description;
    private LocalDate targetDate;
    private boolean done;


    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        Description = description;
        this.targetDate = targetDate;
        this.done = done;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getDescription() {
        return Description;
    }


    public void setDescription(String description) {
        Description = description;
    }


    public LocalDate getTargetDate() {
        return targetDate;
    }


    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }


    public boolean isDone() {
        return done;
    }


    public void setDone(boolean done) {
        this.done = done;
    }


    @Override
    public String toString() {
        return "Todo [id=" + id + ", username=" + username + ", Description=" + Description + ", targetDate="
                + targetDate + ", done=" + done + "]";
    }

    

    
}
