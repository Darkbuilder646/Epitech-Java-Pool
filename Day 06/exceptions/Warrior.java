

public class Warrior extends Character {

    protected Warrior(String nameOfCharacter, String RPGClassOfCharacter) {
        super(nameOfCharacter, RPGClassOfCharacter);
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        Warrior.RPGClass = RPGClassOfCharacter;
        System.out.println(this.name + ": My name will go down in history!");
    }

    protected Warrior(String nameOfCharacter) {
        super(nameOfCharacter);
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        Warrior.RPGClass = "Warrior";
        System.out.println(this.name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if (weapon == null) {
            throw new WeaponException(WeaponException.MESSAGE_NOT_DEFINED);
        } else if (weapon.isEmpty()) {
            throw new WeaponException(WeaponException.MESSAGE_EMPTY_STRING);
        } else if (!isWeaponSuitableForWarrior(weapon)) {
            throw new WeaponException(WeaponException.MESSAGE_INAPPROPRIATE_WARRIOR.replace("[weapon]", weapon));
        }
        System.out.println(this.name + ": Rrrrrrrrr....");
        System.out.println(this.name + ": I'll crush you with my " + weapon + "!");
    }

    public void tryToAttack(String weapon) {
        try {
            attack(weapon);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isWeaponSuitableForWarrior(String weapon) {
        if(!weapon.equals("hammer") && !weapon.equals("sword")) {
            return false;
        }
        return true;
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left like a bad boy.");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right like a bad boy.");
    }

}
