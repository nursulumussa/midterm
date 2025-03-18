import java.util.Scanner;
public class MidtermProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Выберите кофе (espresso): ");
        String coffeeType = in.nextLine();
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);


        System.out.println("Добавить молоко? (yes/no): ");
        if (in.nextLine().equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }
        System.out.println("Ваш напиток: " + coffee.getDescription() + " = $" + coffee.getCost());


        System.out.println("Выберите метод оплаты (creditcard/paypal): ");
        String paymentType = in.nextLine();
        PaymentMethod payment = PaymentFactory.getPaymentMethod(paymentType);
        payment.processPayment(coffee.getCost());
    }
}
