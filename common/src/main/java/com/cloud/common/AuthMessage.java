package com.cloud.common;

public class AuthMessage extends Message {
    private String login;
    private String password;
    private static final long serialVersionUID = 11L;

    public AuthMessage(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
