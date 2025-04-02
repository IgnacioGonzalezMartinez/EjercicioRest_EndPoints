package com.example.EjercicioEndPoints.models;

public class Code {
    private int id;
    private String idPackage;
    private String file;

    
    public Code() {}

    
    public Code(int id, String idPackage, String file) {
        this.id = id;
        this.idPackage = idPackage;
        this.file = file;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdPackage() {
        return idPackage;
    }

    public void setIdPackage(String idPackage) {
        this.idPackage = idPackage;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    
    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", idPackage='" + idPackage + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}
