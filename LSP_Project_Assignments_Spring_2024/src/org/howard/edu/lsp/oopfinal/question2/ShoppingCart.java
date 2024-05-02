package org.howard.edu.lsp.oopfinal.question2;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set. Please select a payment method.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}