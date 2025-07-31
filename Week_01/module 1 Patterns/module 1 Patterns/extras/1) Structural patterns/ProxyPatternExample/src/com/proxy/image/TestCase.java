package com.proxy.image;

public class TestCase {
    public static void main(String[] args) {

        Image img1 = new ProxyImage("Image sample 1");
        Image img2 = new ProxyImage("Image sample 2");
        Image img3 = new ProxyImage("Image sample of 1 Lazy Implementation");
        img1.display();
        System.out.println("-----");
        img2.display();
        System.out.println("-----");
        img3.display();
    }
}
