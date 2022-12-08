package com.example.quanlicongviecnhom5.model;

public class User {
    String name = "";
    String phoneNumber = "";
    String passWord = "";
    public User(){

    }
    public User(String name, String phoneNumber, String passWord){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setName(String name) {
        this.name = name;
    }
}
