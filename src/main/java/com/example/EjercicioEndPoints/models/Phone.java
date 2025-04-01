package com.example.EjercicioEndPoints.models;

public class Phone {
    private int id;
    private String value;
    private String type;

    // Constructor vacío
    public Phone() {}

    // Constructor con parámetros
    public Phone(int id, String value, String type) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
