import chocolate.*;
import planet.*;

public class Exemple {
    public static void main(String[] args) {

        Astronaut feldspar = new Astronaut("Feldspar");
        Astronaut riebeck = new Astronaut("Riebeck");
        Astronaut esker = new Astronaut("Esker");

        Team odyssey = new Team("Outer Wilds Ventures");

        odyssey.add(feldspar);
        odyssey.add(riebeck);
        odyssey.add(esker);

        System.out.println(odyssey.countMembers());

        planet.Mars brittleHollow = new planet.Mars("Under the crust");
        riebeck.doActions(brittleHollow);

        odyssey.showMembers();
        odyssey.remove(riebeck);
        System.out.println(odyssey.countMembers());

    }
}
