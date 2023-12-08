public class AssaultTerminator extends SpaceMarine{

    protected AssaultTerminator(String nameOfUnit) {
        super(nameOfUnit, 150, 30);
        System.out.println(this.name + " has teleported from space.");
        equip(new PowerFist());
    }

    @Override
    public void receiveDamage(int damageReceived) {
        if (this.hp > 0) {
            int reducedDamage = damageReceived - 3;
            if (reducedDamage < 1) {
                reducedDamage = 1; 
            }
            this.hp -= reducedDamage;
            if (this.hp <= 0) {
                this.hp = 0;
                this.isDead = true;
            }
        }
    }
    
}
