package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // CreditCardPayment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        creditCardPayment.pay(100.0);

        // PayPalPayment strategy
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        payPalPayment.pay(50.0);

        // BitcoinPayment strategy
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
        bitcoinPayment.pay(75.0);
    }
}