class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal: $" + amount);
    }
}