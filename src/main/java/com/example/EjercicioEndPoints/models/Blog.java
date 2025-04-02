package com.example.EjercicioEndPoints.models;

import java.time.LocalDate;

public class Blog {
    private int id;
    private String title;
    private LocalDate date;

    
    public Blog() {}

    
    public Blog(int id, String title, LocalDate date) {
        this.id = id;
        this.title = title;
        this.date = date;
    }

    
    public int getId() {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    
    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}
