package com.store.store;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed using Paypal");
        System.out.println("Amount: " + amount);
    }
}
