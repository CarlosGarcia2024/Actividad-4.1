package com.example.registrodedatos.entity;

public class User {
    private int document;
    private String names;
    private String lastNames;
    private String password;
    private String user;

    public User(int document, String names, String lastNames, String password,String user) {
        this.document = document;
        this.names = names;
        this.lastNames = lastNames;
        this.password = password;
        this.user = user;
    }

    public User() {
    }
    public String setUser(String string) {
        return user;
    }
    public String getUser() {
        return user;
    }
    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("document=").append(document);
        sb.append(", names='").append(names).append('\'');
        sb.append(", lastNames='").append(lastNames).append('\'');
        sb.append(", user='").append(user).append('\'');
        sb.append(", password='").append(password).append('\'');

        sb.append('}');
        return sb.toString();
    }
}