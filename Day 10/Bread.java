public abstract class Bread implements Food {

    private double price;
    private int calories;
    protected int bakingTime = 0;

    public Bread(double price, int calories) {
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
    
    public int getBakingTime() {
        return bakingTime;
    }
}
