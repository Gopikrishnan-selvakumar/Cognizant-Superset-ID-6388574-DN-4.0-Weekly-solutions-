package com.gobi;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return "Hello, " + name;
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }
}
