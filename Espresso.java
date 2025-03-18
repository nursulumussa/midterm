class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Эспрессо";
    }
    @Override
    public double getCost() {
        return 2.00;
    }
}