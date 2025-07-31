
package com.adapter.payment.adaptees;

public class PayPalGateway {
    public void sendPayment(String currency, double total) {
        System.out.println("PayPal charged " + total + " " + currency);
    }
}
