package com.store.store;

public class OrderService {
    private PaymentService paymentService;

//   public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.processPayment(100.0);
    }

//    public PaymentService getPaymentService() {
//        return paymentService;
//    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
