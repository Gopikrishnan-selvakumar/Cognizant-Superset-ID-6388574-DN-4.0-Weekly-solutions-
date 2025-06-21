package com.strategy.payment;

public class CreditCardPayment implements PaymentStrategy {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.printf(" Charged %.2f via Credit Card %s%n",
                amount, mask(cardNumber));
    }

    private String mask(String num) {
        return "****‑****‑****‑" + num.substring(num.length() - 4);
    }
}
