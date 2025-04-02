package com.example.EjercicioEndPoints.models;

public class Article {
    private int id;
    private String title;
    private String abstractText;
    private String content;

    
    public Article() {}

    
    public Article(int id, String title, String abstractText, String content) {
        this.id = id;
        this.title = title;
        this.abstractText = abstractText;
        this.content = content;
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

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", abstractText='" + abstractText + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
