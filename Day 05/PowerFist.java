public class PowerFist extends Weapon {
    private String output;

    public PowerFist() {
        super("Power Fist", 8, 50, true);
        this.output = "SBAM";
    }

    @Override
    public void attack() {
        System.out.println(this.output);
    }
    
}
