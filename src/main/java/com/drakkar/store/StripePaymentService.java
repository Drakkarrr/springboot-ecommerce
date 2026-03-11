package com.drakkar.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiURL}")
    private String apiURL;


    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println( "Processing payment of " + amount);
    }
}
