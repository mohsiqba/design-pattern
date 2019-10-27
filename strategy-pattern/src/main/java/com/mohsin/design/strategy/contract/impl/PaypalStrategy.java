package com.mohsin.design.strategy.contract.impl;

import com.mohsin.design.strategy.contract.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}