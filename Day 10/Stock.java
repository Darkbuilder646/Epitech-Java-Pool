import java.util.HashMap;
import java.util.Map;

public class Stock {
    
    private Map<Class<? extends Food>, Integer> stock;

    public Stock() {
        stock = new HashMap<>();
        stock.put(FrenchBaguette.class, 100);
        stock.put(SoftBread.class, 100);
        stock.put(HamSandwich.class, 100);
        stock.put(Panini.class, 100);
        stock.put(AppleSmoothie.class, 100);
        stock.put(Coke.class, 100);
        stock.put(Cookie.class, 100);
        stock.put(CheeseCake.class, 100);
    }

    public int getNumberOf(Class<? extends Food> foodType) {
        Integer quantity = stock.get(foodType);
        return (quantity != null) ? quantity : 0;
    }

    public boolean add(Class<? extends Food> foodType) throws NoSuchFoodException {
        if (!stock.containsKey(foodType)) {
            throw new NoSuchFoodException(NoSuchFoodException.MESSAGE_WRONG_FOOD_TYPE.replace("[class name]", foodType.getName()));
        }

        Integer quantity = stock.get(foodType);
        stock.put(foodType, quantity + 1);
        return true;
    }

    public boolean remove(Class<? extends Food> foodType) throws NoSuchFoodException {
        if (!stock.containsKey(foodType)) {
            throw new NoSuchFoodException(NoSuchFoodException.MESSAGE_WRONG_FOOD_TYPE.replace("[class name]", foodType.getName()));
        }

        Integer quantity = stock.get(foodType);
        if (quantity > 0) {
            stock.put(foodType, quantity - 1);
            return true;
        }
        return false;
    }
}
