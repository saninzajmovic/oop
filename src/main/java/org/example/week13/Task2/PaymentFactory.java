package org.example.week13.Task2;

class PaymentFactory {
    public Payment createPayment(String type){
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type) {
            case "creditCard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            default:
                throw new IllegalArgumentException("Unknown payment method: " + type);
        }
    }
}

class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();

        Payment creditCardPayment = paymentFactory.createPayment("creditCard");
        creditCardPayment.processPayment();

        Payment paypalPayment = paymentFactory.createPayment("paypal");
        paypalPayment.processPayment();
    }
}