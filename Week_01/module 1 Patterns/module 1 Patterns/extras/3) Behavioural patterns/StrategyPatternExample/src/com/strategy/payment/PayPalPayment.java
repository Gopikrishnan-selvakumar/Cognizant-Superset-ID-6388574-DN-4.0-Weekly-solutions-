package com.strategy.payment;

public class PayPalPayment implements PaymentStrategy {

    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.printf(" Paid %.2f using PayPal (%s)%n", amount, email);
    }
}
