import java.util.ArrayList;

public class CustomerOrder {
    private Stock stock;
    private ArrayList<Food> orderItems;
    private ArrayList<Menu<? extends Food, ? extends Food>> orderMenus;

    public CustomerOrder(Stock stock) {
        this.orderItems = new ArrayList<>();
        this.orderMenus = new ArrayList<>();
        this.stock = stock;
    }

    public boolean addItem(Food foodToAdd) throws NoSuchFoodException {
        if (stock.remove(foodToAdd.getClass())) {
            orderItems.add(foodToAdd);
            return true;
        }
        return false;
    }

    public boolean removeItem(Food foodToRemove) throws NoSuchFoodException {
        if (orderItems.remove(foodToRemove)) {
            stock.add(foodToRemove.getClass());
            return true;
        }
        return false;
    }

    public double getPrice() {
        double total = 0.0f;
        for (Food food : orderItems) {
            total += food.getPrice();
        }
        return total;
    }

    public boolean addMenu(Menu<? extends Food, ? extends Food> menuToAdd) throws NoSuchFoodException {
        if (stock.getNumberOf(menuToAdd.getDrink().getClass()) > 0
                && stock.getNumberOf(menuToAdd.getMeal().getClass()) > 0) {
            stock.remove(menuToAdd.getDrink().getClass());
            stock.remove(menuToAdd.getMeal().getClass());

            orderMenus.add(menuToAdd);
            return true;
        }
        return true;
    }

    public boolean removeMenu(Menu<? extends Food, ? extends Food> menuToRemove) throws NoSuchFoodException {
        if (orderMenus.remove(menuToRemove)) {
            stock.add(menuToRemove.getDrink().getClass());
            stock.add(menuToRemove.getMeal().getClass());
            return true;
        }
        return false;
    }

    public void printOrder() {
        System.out.println("Your order is composed of:");

        double totalOrderPrice = 0;

        for (Menu<? extends Food, ? extends Food> menu : orderMenus) {
            System.out.println("- " + menu.getClass().getSimpleName() + " (" + menu.getPrice() + " euros)");
            totalOrderPrice += menu.getPrice();
            System.out.println("-> drink: " + menu.getDrink().getClass().getSimpleName());
            System.out.println("-> meal: " + menu.getMeal().getClass().getSimpleName());
        }

        for (Food item : orderItems) {
            System.out.println("- " + item.getClass().getSimpleName() + " (" + item.getPrice() + " euros)");
            totalOrderPrice += item.getPrice();
        }

        double roundOrderTotal = Math.round(totalOrderPrice * 100.0) / 100.0;

        System.out.println("For a total of " + roundOrderTotal + " euros.");

    }

}
