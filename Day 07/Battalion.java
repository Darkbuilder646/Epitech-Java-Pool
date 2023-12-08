import java.util.ArrayList;
import java.util.List;

public class Battalion {
    private List<Character> compoBattalion;

    public Battalion() {
        this.compoBattalion = new ArrayList<>();
    }

    public void add(List<? extends Character> characterToAdd) {
        compoBattalion.addAll(characterToAdd);
    }

    public void display(){
        for (Character character : compoBattalion) {
            System.out.println(character.getName());
        }
    }

    public boolean fight() {
        if (compoBattalion.size() < 2) {
            return false;
        }
    
        Character character1 = compoBattalion.get(0);
        Character character2 = compoBattalion.get(1);
    
        int result = character1.compareTo(character2);
    
        if (result > 0) {
            //? character1 win
            compoBattalion.remove(1);
        } else if (result < 0) {
            //? character2 win
            compoBattalion.remove(0);
        } else {
            //? Tie
            compoBattalion.remove(1);
            compoBattalion.remove(0);
        }
    
        return true;
    }

}
