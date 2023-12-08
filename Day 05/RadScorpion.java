public class RadScorpion extends Monster {
    private static int nextId = 0;
    private int id;

    protected RadScorpion() {
        super("RadScorpion #" + (nextId + 1), 80, 50);
        System.out.println("RadScorpion #" + (nextId + 1) + ": Crrr!");
        this.damage = 25;
        this.apcost = 8;
        nextId++;
        this.id = nextId;
    }

    @Override
    public boolean attack(Fighter target) {
        if (this != target) {
            if (moveCloseTo(target)) {
                if (getAp() >= apcost) {
                    ap -= apcost;

                    if (target instanceof SpaceMarine) {
                        SpaceMarine spaceMarine = (SpaceMarine) target;
                        if (spaceMarine instanceof AssaultTerminator) {
                            System.out.println(this.name + " attacks " + target.getName());
                            target.receiveDamage(damage);
                        } else {
                            target.receiveDamage(damage * 2); //? Double damage for non-AssaultTerminator SpaceMarines
                        }
                    } else {
                        System.out.println(this.name + " attacks " + target.getName());
                        target.receiveDamage(damage);
                    }

                    return true;
                }
            } else {
                System.out.println(this.name + ": I'm too far away from " + target.getName());
            }
        }
        return false;
    }
    
}
