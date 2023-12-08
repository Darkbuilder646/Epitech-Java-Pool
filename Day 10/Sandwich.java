import java.util.ArrayList;

public abstract class Sandwich implements Food{
    protected boolean vegetarian = false;
    private double price;
    private int calories;
    protected ArrayList<String> ingredients = new ArrayList<>();
    
    
    public Sandwich(double price, int calories) {
        this.price = price;
        this.calories = calories;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
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
