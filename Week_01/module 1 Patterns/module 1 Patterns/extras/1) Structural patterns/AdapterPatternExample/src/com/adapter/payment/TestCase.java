package com.adapter.payment;

import com.adapter.payment.adapters.*;

public class TestCase {
    public static void main(String[] args) {
        PaymentProcessor payPal = new PayPalAdapter();
        PaymentProcessor stripe = new StripeAdapter();

        payPal.processPayment(49.99);
        stripe.processPayment(19.95);
    }
}
