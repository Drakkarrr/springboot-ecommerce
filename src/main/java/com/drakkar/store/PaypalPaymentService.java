package com.drakkar.store;

public class PaypalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal");
        System.out.println( "Processing payment of " + amount);
    }
}
