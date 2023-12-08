public class Mage extends Character {

    protected Mage(String nameOfCharacter) {
        super(nameOfCharacter, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(this.name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        if(!weapon.equals("magic") && !weapon.equals("wand")) {
            return;
        }
        System.out.println(this.name + ": Rrrrrrrrr....");
        System.out.println(this.name + ": Feel the power of my " + weapon + "!");
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
