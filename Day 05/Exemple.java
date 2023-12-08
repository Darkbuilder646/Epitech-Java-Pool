import java.util.*;

public class Exemple {
    public static void main(String[] args) {
        SpaceArena arena = new SpaceArena();

        arena.enlistMonsters(Arrays.asList(
            new RadScorpion(), 
            new SuperMutant(), 
            new RadScorpion()));

        arena.enlistSpaceMarines(Arrays.asList(
            new TacticalMarine("Joe"), 
            new AssaultTerminator("Abaddon"), 
            new TacticalMarine("Rose")));

        arena.fight();
    }
}
