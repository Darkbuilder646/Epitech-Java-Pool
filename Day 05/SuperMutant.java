public class SuperMutant extends Monster {

    private static int nextId = 0;
    private int id;

    protected SuperMutant() {
        super("SuperMutant #" + (nextId + 1), 170, 20);
        System.out.println("SuperMutant #" + (nextId + 1) + ": Roaarrr!");
        this.damage = 60;
        this.apcost = 20;
        nextId++;
        this.id = nextId;
    }

    @Override
    public void recoverAP() {
        if (this.hp == 0) {
            return;
        }
        this.ap += 7; 
        if (this.ap >= 50) {
            this.ap = 50;
        }
        this.hp += 10;
        if (this.hp > 170) {
            this.hp = 170;
        }
    }
    
}
