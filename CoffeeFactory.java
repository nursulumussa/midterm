class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            default -> throw new IllegalArgumentException("Неизвестный вид кофе");
        };
    }
}
