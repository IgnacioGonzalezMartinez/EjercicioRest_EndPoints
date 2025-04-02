package com.example.EjercicioEndPoints.models;

public class Proyecto {
    private Long id;
    private String description;
    private String language;
    private boolean open;

    
    public Proyecto() {}


    public Proyecto(long id, String description, String language, boolean open) {
        this.id = (long) id;
        this.description = description;
        this.language = language;
        this.open = open;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long idCounter) {
        this.id = idCounter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", open=" + open +
                '}';
    }
}
