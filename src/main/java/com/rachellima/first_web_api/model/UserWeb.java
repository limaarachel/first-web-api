package com.rachellima.first_web_api.model;

public class UserWeb {
    private String id;

    public UserWeb(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private String login;
    private String password;


    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UserWeb{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
