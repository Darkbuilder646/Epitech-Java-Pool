public class Shark extends Animal {
    private boolean frenzy;

    protected Shark(String nameOfAnimal) {
        super(nameOfAnimal, 0, Type.FISH);
        this.frenzy = false;
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean frenzyMode) {
        this.frenzy = frenzyMode;
    }

    public void status() {
        if (this.frenzy) {
            System.out.println(super.getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(super.getName() + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal animalToEat) {
        String typeOfAnimal = animalToEat.getType();
        switch (typeOfAnimal) {
            case "mammal":
                return true;

            case "fish":
                if(animalToEat.getName() == super.getName()) {
                    return false;
                }
                return true;

            case "bird":
                return true;
                
            default:
                return false;
        }
    }

    public void eat(Animal animalToEat) {
        String typeOfAnimal = animalToEat.getType();
        if(canEat(animalToEat)) {
            System.out.println(super.getName() + " ate a " + typeOfAnimal + " named " + animalToEat.getName() + ".");
            this.frenzy = false;
        } else {
            System.out.println(super.getName() + ": It's not worth my time.");
        }
    }
    

}
