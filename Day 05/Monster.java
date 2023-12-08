public abstract class Monster extends Unit {
    protected int damage = 0;
    protected int apcost = 0;
    
    protected Monster(String nameOfUnit, int hpOfUnit, int apOfUnit) {
        super(nameOfUnit, hpOfUnit, apOfUnit);
    }
    
    public int getDamage() {
        return damage;
    }

    public int getApcost() {
        return apcost;
    }

    @Override
    public boolean attack(Fighter target) {
        if (this != target) {
            if (moveCloseTo(target)) {
                if (getAp() >= apcost) {
                    ap -= apcost;
                    System.out.println(this.name + " attacks " + target.getName());
                    target.receiveDamage(damage);
                    return true;
                }
            } else {
                System.out.println(this.name + ": I'm too far away from " + target.getName());
            }
        }
        return false;
    }

    @Override
    public boolean equip(Weapon weaponToEquip) {
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    @Override
    public void recoverAP() {
        if(this.hp == 0) {
            return;
        }
        this.ap += 7; //* Number of ap to recover
        if(this.ap >= 50) {
            this.ap = 50;
        }
        
    }
}
