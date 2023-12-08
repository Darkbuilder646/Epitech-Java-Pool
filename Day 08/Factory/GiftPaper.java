package Factory;

public class GiftPaper {
    
    private Toy gift;

    public GiftPaper() {
        this.gift = null;
    }

    public void wrap(Toy toyToWarp) {
        this.gift = toyToWarp;
    }

    public Toy unwrap() {
        Toy tempToy = this.gift;
        this.gift = null;
        return tempToy;
    }
}
