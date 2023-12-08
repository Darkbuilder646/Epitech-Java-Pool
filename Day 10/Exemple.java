public class Exemple {
    public static void main(String[] args) {
        Breakfast<AppleSmoothie, SoftBread> breakfast = new Breakfast<>(new AppleSmoothie(), new SoftBread());
        AfternoonTea<Coke, CheeseCake> tea = new AfternoonTea<>(new Coke(), new CheeseCake());
        Food dessert2 = new Cookie();
        Food drink2 = new AppleSmoothie();
        Stock stock = new Stock();
        CustomerOrder order = new CustomerOrder(stock);
        try {
            order.addItem(dessert2);
            order.addItem(drink2);
            order.addMenu(breakfast);
            order.addMenu(tea);
        } catch (NoSuchFoodException e) {
            System.out.println(e.getMessage());
        }
        order.printOrder();
    }
}
