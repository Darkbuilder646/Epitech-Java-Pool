

public class Mage extends Character {

    protected Mage(String nameOfCharacter, String RPGClassOfCharacter) {
        super(nameOfCharacter, RPGClassOfCharacter);
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        Mage.RPGClass = RPGClassOfCharacter;
        System.out.println(this.name + ": May the gods be with me.");
    }
    protected Mage(String nameOfCharacter) {
        super(nameOfCharacter);
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        Mage.RPGClass = "Mage";
        System.out.println(this.name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if (weapon == null) {
            throw new WeaponException(WeaponException.MESSAGE_NOT_DEFINED);
        } else if (weapon.isEmpty()) {
            throw new WeaponException(WeaponException.MESSAGE_EMPTY_STRING);
        } else if (!isWeaponSuitableForMage(weapon)) {
            throw new WeaponException(WeaponException.MESSAGE_INAPPROPRIATE_MAGE.replace("[weapon]", weapon));
        }
        System.out.println(this.name + ": Rrrrrrrrr....");
        System.out.println(this.name + ": Feel the power of my " + weapon + "!");
    }

    public void tryToAttack(String weapon) {
        try {
            attack(weapon);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private boolean isWeaponSuitableForMage(String weapon) {
        if(!weapon.equals("magic") && !weapon.equals("wand")) {
            return false;
        }
        return true;
    }
    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left furtively.");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right furtively.");
    }

}
