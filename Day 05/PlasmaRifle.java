public class PlasmaRifle extends Weapon {
    private String output;

    public PlasmaRifle() {
        super("Plasma Rifle", 5, 21, false);
        this.output = "PIOU";
    }

    @Override
    public void attack() {
        System.out.println(this.output);
    }
    
}
