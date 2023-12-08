public class Exemple {
    public static void main ( String [] args ) {
            // Canary titi = new Canary("Titi");
            Shark willy = new Shark("Willy");
            // Cat kitty = new Cat("Kitty");
            // BlueShark bob = new BlueShark("Bob");
            GreatWhite bruce = new GreatWhite("Bruce");
            // Animal nemo = new Animal("Nemo", 0, Animal.Type.FISH);

            bruce.smellBlood(true);
            bruce.status();
            bruce.eat(willy);
            bruce.status();
        }

}