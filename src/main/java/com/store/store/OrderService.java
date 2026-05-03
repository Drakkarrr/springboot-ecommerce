package com.store.store;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private PaymentService paymentService;

   public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
       System.out.println("OrderService created");
    }


    @PostConstruct
    public void OrderServiceinit() {
        System.out.println("OrderService init, post construct");
   }

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
