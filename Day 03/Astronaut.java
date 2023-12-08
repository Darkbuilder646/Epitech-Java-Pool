import planet.Mars;

public class Astronaut {
    private static int nextId = 0;
    private final int id;

    private String name;
    private int snacks = 0;
    private String destination = null;

    public Astronaut(String nameOfAstronaut) {
        this.name = nameOfAstronaut;
        this.id = nextId;
        this.snacks = 0;
        this.destination = null;
        nextId++;
        System.out.println(this.name + " ready for launch!");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSnacks() {
        return snacks;
    }

    public String getDestination() {
        return destination;
    }

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
    }

    public void doActions(Object action) {
        if(action == null) 
        {
            System.out.println(this.name + ": Nothing to do.");
            if(this.destination == null);
            {
                System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
            }
        } 
        else if (action instanceof planet.Mars) 
        {
            if (this.destination == null) 
            {
                this.destination = ((Mars) action).getLandingSite();
            }
            System.out.println(this.name + ": Started a mission!");
        } 
        else if (action instanceof chocolate.Mars) 
        {
            chocolate.Mars mars = (chocolate.Mars) action;
            System.out.println(this.name + ": Thanks for this Mars number " + mars.getId());
            this.snacks++;
            if (this.destination == null) 
            {
                System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
            }
        }
    }

}
