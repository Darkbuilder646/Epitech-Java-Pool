public class Animal {
    protected enum Type {
        MAMMAL,
        FISH,
        BIRD,
    }

    private static int numberOfAnimals;
    private static int numberOfMammals;
    private static int numberOfFish;
    private static int numberOfBirds;

    private String name;
    private int legs;
    private Type type;

    protected Animal(String nameOfAnimal, int nbrOfLegs, Type typeOfAnimal) {
        this.name = nameOfAnimal;
        this.legs = nbrOfLegs;
        this.type = typeOfAnimal;
        System.out.println("My name is " + this.name + " and I am a " + getType() + "!");
        incrementCounters();
    }

    private void incrementCounters() {
        numberOfAnimals++;
        switch (this.type) {
            case MAMMAL:
                numberOfMammals++;
                break;
            case FISH:
                numberOfFish++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
        }
    }

    // #region //* Getter
    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        return type.toString().toLowerCase();
    }

    public static int getNumberOfAnimals() {
        if (numberOfAnimals == 1) {
            System.out.println("There is currently 1 animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        if (numberOfMammals == 1) {
            System.out.println("There is currently 1 mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        if (numberOfFish == 1) {
            System.out.println("There is currently 1 fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        return numberOfFish;
    }

    public static int getNumberOfBirds() {
        if (numberOfBirds == 1) {
            System.out.println("There is currently 1 bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;
    }

    // #endregion
}
