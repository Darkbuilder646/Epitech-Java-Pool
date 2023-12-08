package planet;

public class Mars {
    private static int nextId = 0;
    private final int id;

    private final String landingSite;

    
    public Mars(String nameOfLandingSite) {
        this.id = nextId;
        nextId++;
        this.landingSite = nameOfLandingSite;
    }
    
    public int getId() {
        return id;
    }
    
    public String getLandingSite() {
        return landingSite;
    }
}
