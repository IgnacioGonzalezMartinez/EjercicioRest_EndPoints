package com.example.EjercicioEndPoints.models;

public class Users {
    private int id;
    private String nick;
    private String name;

    
    public Users() {}

    
    public Users(int id, String nick, String name) {
        this.id = id;
        this.nick = nick;
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
