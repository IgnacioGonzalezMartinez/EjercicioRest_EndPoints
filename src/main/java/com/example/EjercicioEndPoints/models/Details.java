package com.example.EjercicioEndPoints.models;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Details {
    private int id;
    private LocalDate date;
    private String content;
    private String type;
    private BigDecimal budget;

    // Constructor vacío
    public Details() {}

    // Constructor con parámetros
    public Details(int id, LocalDate date, String content, String type, BigDecimal budget) {
        this.id = id;
        this.date = date;
        this.content = content;
        this.type = type;
        this.budget = budget;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", date=" + date +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", budget=" + budget +
                '}';
    }
}
