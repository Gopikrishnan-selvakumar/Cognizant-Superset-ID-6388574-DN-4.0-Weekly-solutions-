package com.strategy.payment;

public class Demo {
    public static void main(String[] args) {

        PaymentContext ctx = new PaymentContext(
                new CreditCardPayment("1234567890123456"));
        ctx.checkout(99.99);

        System.out.println("----- switch strategy at runtime -----");

        ctx.setStrategy(new PayPalPayment("Indian Bank"));
        ctx.checkout(49.50);
    }
}
