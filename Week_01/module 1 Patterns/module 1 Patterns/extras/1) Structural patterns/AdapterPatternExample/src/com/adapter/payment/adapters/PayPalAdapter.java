
package com.adapter.payment.adapters;

import com.adapter.payment.PaymentProcessor;
import com.adapter.payment.adaptees.PayPalGateway;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalGateway payPal = new PayPalGateway();
    @Override
    public void processPayment(double amount) {
        payPal.sendPayment("USD", amount);
    }
}
