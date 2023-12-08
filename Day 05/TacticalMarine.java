public class TacticalMarine extends SpaceMarine{

    protected TacticalMarine(String nameOfUnit) {
        super(nameOfUnit, 100, 20);
        System.out.println(this.name + " on duty.");
        equip(new PlasmaRifle());
    }

    @Override
    public void recoverAP() {
        if(this.hp == 0) {
            return;
        }
        this.ap += 12; //* Number of ap to recover
        if(this.ap >= 50) {
            this.ap = 50;
        }
        
    }
    
}
