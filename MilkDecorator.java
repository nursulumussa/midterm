class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", молоко";
    }
    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}