import java.util.Collections;

public class Panini extends Sandwich{

    public Panini() {
        super(3.50, 120);
        this.vegetarian = true;
        Collections.addAll(this.ingredients, "tomato", "salad", "cucumber", "avocado", "cheese");
    }
}
