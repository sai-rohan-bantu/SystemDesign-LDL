package com.example;

import com.example.Processor.PaymentProcessor;
import com.example.Strategy.CreditCardPayment;
import com.example.Strategy.PayPalPayment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern Example");
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCardPayment);
        paymentProcessor.process(100.0);
        paymentProcessor.setPaymentStrategy(payPalPayment);
        paymentProcessor.process(200.0);
    }
}