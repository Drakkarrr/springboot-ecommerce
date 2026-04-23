package com.store.store;

public class OrderService {
    public void placeOrder() {
        var PaymentService = new StripePaymentService();
        PaymentService.processPayment(100.0);
    }
}
