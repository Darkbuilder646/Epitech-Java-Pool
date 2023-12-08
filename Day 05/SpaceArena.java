import java.util.ArrayList;
import java.util.List;

public class SpaceArena {
    private List<Monster> registeredMonsters;
    private List<SpaceMarine> registeredSpaceMarines;

    public SpaceArena() {
        registeredMonsters = new ArrayList<>();
        registeredSpaceMarines = new ArrayList<>();
    }

    public void enlistMonsters(List<Monster> monsters) {
        for (Monster monster : monsters) {
            if (!registeredMonsters.contains(monster)) {
                registeredMonsters.add(monster);
            }
        }
    }

    public void enlistSpaceMarines(List<SpaceMarine> spaceMarines) {
        for (SpaceMarine spaceMarine : spaceMarines) {
            if (!registeredSpaceMarines.contains(spaceMarine)) {
                registeredSpaceMarines.add(spaceMarine);
            }
        }
    }

    public boolean fight() {
        if (registeredMonsters.isEmpty()) {
            System.out.println("No monsters available to fight.");
            return false;
        }
    
        if (registeredSpaceMarines.isEmpty()) {
            System.out.println("Those cowards ran away.");
            return false;
        }
        
        while (!registeredMonsters.isEmpty() && !registeredSpaceMarines.isEmpty()) {
            SpaceMarine spaceMarine = registeredSpaceMarines.get(0); //? The first SpaceMarine always goes first
            System.out.println(spaceMarine.getName() + " has entered the arena.");
            Monster monster = registeredMonsters.get(0);
            System.out.println(monster.getName() + " has entered the arena.");
    
            boolean roundOver = false;
    
            while (!roundOver) {
                // Fighter 1 (SpaceMarine) attacks
                boolean attackSuccess = spaceMarine.attack(monster);
                if (attackSuccess) {
                    // System.out.println(spaceMarine.getName() + " has successfully attacked.");
                    roundOver = true;
                } else if (!spaceMarine.moveCloseTo(monster)) {
                    System.out.println(spaceMarine.getName() + " is going closer to " + monster.getName() + ".");
                } else if (!attackSuccess && spaceMarine.getAp() < spaceMarine.weapon.getApcost()) {
                    spaceMarine.recoverAP();
                    System.out.println(spaceMarine.getName() + " is recovering AP.");
                }
    
                // Check if Fighter 2 (Monster) is still alive
                if (monster.getHp() == 0) {
                    roundOver = true;
                }
    
                // Fighter 2 (Monster) attacks
                attackSuccess = monster.attack(spaceMarine);
                if (attackSuccess) {
                    // System.out.println(monster.getName() + " has successfully attacked.");
                    roundOver = true;
                } else if (!monster.moveCloseTo(spaceMarine)) {
                    System.out.println(monster.getName() + " is going closer to " + spaceMarine.getName() + ".");
                } else if (!attackSuccess && monster.getAp() < monster.getApcost()) {
                    monster.recoverAP();
                    System.out.println(monster.getName() + " is recovering AP.");
                }
    
                // Check if Fighter 1 (SpaceMarine) is still alive
                if (spaceMarine.getHp() == 0) {
                    roundOver = true;
                }
            }
    
            // Check for winners and update the list of registered fighters
            if (monster.getHp() == 0) {
                // System.out.println(spaceMarine.getName() + " is victorious.");
                spaceMarine.recoverAP();
                registeredMonsters.remove(0);
                System.out.println(registeredSpaceMarines.get(0).getName() + " has entered the arena.");
            } else if (spaceMarine.getHp() == 0) {
                // System.out.println(monster.getName() + " is victorious.");
                monster.recoverAP();
                registeredSpaceMarines.remove(0);
            }
        }
    
        if (registeredMonsters.isEmpty()) {
            System.out.println("The spaceMarines are victorious.");
        } else {
            System.out.println("The monsters are victorious.");
        }
    
        return true;
    }
}
