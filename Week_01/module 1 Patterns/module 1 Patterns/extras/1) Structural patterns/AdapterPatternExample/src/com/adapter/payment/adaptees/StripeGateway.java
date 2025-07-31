
package com.adapter.payment.adaptees;

public class StripeGateway {
    public void makeCharge(int cents) {
        System.out.println("Stripe charged " + cents + " cents");
    }
}
