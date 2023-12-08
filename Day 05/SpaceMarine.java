public abstract class SpaceMarine extends Unit {
    protected Weapon weapon;

    
    protected SpaceMarine(String nameOfUnit, int hpOfUnit, int apOfUnit) {
        super(nameOfUnit, hpOfUnit, apOfUnit);
    }
    
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public boolean attack(Fighter target) {
        if (weapon == null) {
            System.out.println(this.name + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }

        if (weapon.isMelee()) {  //? Weapon type melee
            if (moveCloseTo(target) && getAp() >= weapon.getApcost()) {
                System.out.println(this.name + " attacks " + target.getName() + " with a " + weapon.getName() + ".");
                weapon.attack();
                target.receiveDamage(weapon.getDamage());
                ap -= weapon.getApcost();
                return true;
            } else if (!moveCloseTo(target)) {
                System.out.println(this.name + ": I'm too far away from " + target.getName() + ".");
            }
        } else { //? Weapon type range
            if (getAp() >= weapon.getApcost()) {
                System.out.println(this.name + " attacks " + target.getName() + " with a " + weapon.getName() + ".");
                weapon.attack();
                target.receiveDamage(weapon.getDamage());
                ap -= weapon.getApcost();
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean equip(Weapon weaponToEquip) {
        if (weaponToEquip != null) {
            if (weapon == null) {
                weapon = weaponToEquip;
                System.out.println(this.name + " has been equipped with a " + weaponToEquip.getName() + ".");
                return true;
            } else {
                //* Use by another SpaceMarine
                System.out.println("The weapon is already equipped by another SpaceMarine.");
            }
        }
        return false;
    }

    @Override
    public void recoverAP() {
        if(this.hp == 0) {
            return;
        }
        this.ap += 9; //* Number of ap to recover
        if(this.ap >= 50) {
            this.ap = 50;
        }
        
    }

    @Override
    public boolean moveCloseTo(Fighter fighterToMoveCloseTo) {
        if (weapon != null) {
            //? SpaceMarine have a melee weapon, so do the same has Unit
            return super.moveCloseTo(fighterToMoveCloseTo);
        } else {
            //? SpaceMarine have a range weapon, so don't need to move to the target
            return false;
        }
    }
}
