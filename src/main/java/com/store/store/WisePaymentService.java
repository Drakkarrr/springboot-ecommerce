package com.store.store;

public class WisePaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed using Wise");
        System.out.println("Amount: " + amount);
    }
}
