public abstract class Weapon {
    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;

    protected Weapon(String nameOfWeapon, int apCostOfWeapon, int damageOfWeapon, boolean isMelee) {
        this.name = nameOfWeapon;
        this.apcost = apCostOfWeapon;
        this.damage = damageOfWeapon;
        this.melee = isMelee;
    }

    public abstract void attack();

    public String getName() {
        return name;
    }

    public int getApcost() {
        return apcost;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isMelee() {
        return melee;
    }
}