class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой: $" + amount);
    }
}