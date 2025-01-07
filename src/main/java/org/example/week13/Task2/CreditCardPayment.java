package org.example.week13.Task2;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Paid via credit card");
    }
}
