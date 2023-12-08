public abstract class Character implements Movable {

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;

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


}