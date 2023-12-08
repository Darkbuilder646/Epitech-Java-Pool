public abstract class Menu<D extends Food, F extends Food> {
    protected D drink;
    protected F meal;

    public Menu(D drink, F meal) {
        this.drink = drink;
        this.meal = meal;
    }

    public D getDrink() {
        return drink;
    }

    public F getMeal() {
        return meal;
    }

    public double getPrice() {
        double total = drink.getPrice() + meal.getPrice();
        double discountedTotal = total * 0.9f;
        double roundTotal = Math.round(discountedTotal * 100.0) / 100.0;

        return roundTotal;
    }
}
