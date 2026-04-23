package com.store.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed using Stripe");
        System.out.println("Amount: " + amount);
    }
}
