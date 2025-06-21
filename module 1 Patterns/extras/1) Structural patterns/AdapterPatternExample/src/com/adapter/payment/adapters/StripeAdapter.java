
package com.adapter.payment.adapters;

import com.adapter.payment.PaymentProcessor;
import com.adapter.payment.adaptees.StripeGateway;

public class StripeAdapter implements PaymentProcessor {
    private final StripeGateway stripe = new StripeGateway();
    @Override
    public void processPayment(double amount) {
        int cents = (int) (amount * 100);
        stripe.makeCharge(cents);
    }
}
