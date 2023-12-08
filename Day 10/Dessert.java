public abstract class Dessert implements Food{
    private double price;
    private int calories;


    public Dessert(double price, int calories) {
        this.price = price;
        this.calories = calories;
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
