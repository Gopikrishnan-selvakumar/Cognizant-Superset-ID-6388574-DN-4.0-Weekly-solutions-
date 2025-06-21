package com.proxy.image;

import java.util.concurrent.ConcurrentHashMap;
public class ProxyImage implements Image {

    private final String url;
    private RealImage realImage;
    private static final ConcurrentHashMap<String, RealImage> CACHE =
            new ConcurrentHashMap<>();

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        realImage = CACHE.computeIfAbsent(url, RealImage::new);
        realImage.display();
    }
}
