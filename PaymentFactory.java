class PaymentFactory {
    public static PaymentMethod getPaymentMethod(String type) {
        return switch (type.toLowerCase()) {
            case "creditcard" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            default -> throw new IllegalArgumentException("Неизвестный тип платежа");
        };
    }
}
