package com.example.EjercicioEndPoints.models;

import java.time.LocalDate;

public class Tag {
    private int id;
    private String label;
    private LocalDate date;

    // Constructor vacío
    public Tag() {}

    // Constructor con parámetros
    public Tag(int id, String label, LocalDate date) {
        this.id = id;
        this.label = label;
        this.date = date;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", date=" + date +
                '}';
    }
}
