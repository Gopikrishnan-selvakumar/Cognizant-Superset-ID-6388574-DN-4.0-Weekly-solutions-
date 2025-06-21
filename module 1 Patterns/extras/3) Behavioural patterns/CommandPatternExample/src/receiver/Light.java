package com.command.home.receiver;

public class Light {
    private final String location;
    public Light(String location) {
        this.location = location;
    }
    public void on()  { System.out.println(location + " light ➜ ON"); }
    public void off() { System.out.println(location + " light ➜ OFF"); }
}
