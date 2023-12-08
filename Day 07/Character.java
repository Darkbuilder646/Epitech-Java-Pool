public abstract class Character implements Movable, Comparable<Object> {

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;

    protected int capacity = 0;

    public Character(String name, String rPGClass, int capacity) {
        this.name = name;
        this.RPGClass = rPGClass;
        this.capacity = capacity;
    }

    protected Character(String nameOfCharacter, String RPGClassOfCharacter) {
        this.name = nameOfCharacter;
        this.RPGClass = RPGClassOfCharacter;
    }

    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public final void unsheathe() {
        System.out.println(this.name + ": unsheathes his weapon.");
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return this.RPGClass;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward");

    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back");

    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left");

    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right");

    }

    @Override
    public int compareTo(Object objectToCompare) {
        if (objectToCompare instanceof Character) {
            Character characterToCompare = (Character) objectToCompare;
            if (this.getClass() == characterToCompare.getClass()) {
                return Integer.compare(this.getCapacity(), characterToCompare.getCapacity());
            } else if (this instanceof Mage && characterToCompare instanceof Warrior) {
                int mageCapacity = this.getCapacity();
                int warriorCapacity = characterToCompare.getCapacity();
                if (warriorCapacity % mageCapacity == 0) {
                    return -1; // ? The Warrior is the greatest
                } else {
                    return 1; // ? The Mage is the greatest
                }
            } else if (this instanceof Warrior && characterToCompare instanceof Mage) {
                int warriorCapacity = this.getCapacity();
                int mageCapacity = characterToCompare.getCapacity();
                if (warriorCapacity % mageCapacity == 0) {
                    return -1; // ? The Mage is the greatest
                } else {
                    return 1; // ? The Warrior is the greatest
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

}