// import java.util.List;

// import Factory.*;
// import Composite.*;
// import Observer.*;
import Decorator.*;


public class Exemple {
    public static void main(String[] args) {
        Warrior albert = new BasicWarrior();
        System.out.println("Albert has " + albert.getHp() + " health points.");
        albert = new Shield(albert);
        System.out.println("Albert has " + albert.getHp() + " health point.");

        Warrior georges = new KingWarrior();
        System.out.println("Georges has " + georges.getHp() + " health points and can hit " + georges.getDmg() + " damages.");
        georges = new FireSword(georges);
        georges = new Shield(georges);
        System.out.println("Georges has " + georges.getHp() + " health points.");
        System.out.println("Georges can hit " + georges.getDmg() + " damages.");
    }
}
