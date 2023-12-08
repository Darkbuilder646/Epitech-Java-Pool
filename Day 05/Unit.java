public abstract class Unit implements Fighter {
    protected String name;
    protected int hp;
    protected int ap;
    private Fighter currentTarget;
    protected boolean isDead;

    protected Unit(String nameOfUnit, int hpOfUnit, int apOfUnit) {
        this.name = nameOfUnit;
        this.hp = hpOfUnit;
        this.ap = apOfUnit;
        this.isDead = false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean moveCloseTo(Fighter fighterToMoveCloseTo) {
        if(this.isDead) {
            return false;
        }
        if (this != fighterToMoveCloseTo) {
            if (currentTarget == null || currentTarget != fighterToMoveCloseTo) {
                System.out.println(this.name + " is moving closer to " + fighterToMoveCloseTo.getName());
                currentTarget = fighterToMoveCloseTo;
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveDamage(int damageReceived) {
        if(this.hp > 0) {
            this.hp -= damageReceived;
            if(this.hp <= 0) {
                this.hp = 0;
                this.isDead = true;
                //* This Unit is dead
            }
        }
    }

    @Override
    public int getAp() {
        return 0;
    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void recoverAP() {
        return;
    }

    @Override
    public boolean attack(Fighter fighter) {
        return false;
    }

    @Override
    public boolean equip(Weapon weapon) {
        return false;
    }
    
}
