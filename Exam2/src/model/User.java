package model;

import model.customException.InvalidValueException;

public class User {
    private String email, userName, passWord;

    public User() {
    }

    public User(String email, String userName, String passWord) {
        if (email == null||userName == null||passWord == null) throw new InvalidValueException("Attributes can not be null");
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
