public abstract class Drink implements Food{
    protected boolean aCan = false;
    private double price;
    private int calories;


    public Drink(double price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public boolean isACan() {
        return aCan;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
