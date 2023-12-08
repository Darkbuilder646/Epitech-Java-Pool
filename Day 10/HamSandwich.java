import java.util.Collections;

public class HamSandwich extends Sandwich {

    public HamSandwich() {
        super(4.00, 230);
        this.vegetarian = false;
        Collections.addAll(this.ingredients, "tomato", "salad", "cheese", "ham", "butter");
    }
}
