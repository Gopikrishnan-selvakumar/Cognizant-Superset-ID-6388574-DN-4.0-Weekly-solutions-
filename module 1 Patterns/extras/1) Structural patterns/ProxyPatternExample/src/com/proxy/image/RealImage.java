package com.proxy.image;

public class RealImage implements Image {

    private final String url;

    public RealImage(String url) {
        this.url = url;
        loadFromServer(url);
    }

    private void loadFromServer(String url) {
        System.out.println("Loading image from remote server: " + url);
        try { Thread.sleep(1000); }   // simulate latency
        catch (InterruptedException ignored) {}
    }

    @Override
    public void display() {
        System.out.println("  Displaying image: " + url);
    }
}
