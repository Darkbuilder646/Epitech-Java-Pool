public class GreatWhite extends Shark{

    protected GreatWhite(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    @Override
    public boolean canEat(Animal animalToEat) {
        if(animalToEat instanceof Canary) {
            return false;
        }
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
                return true;
        }
    }
    @Override
    public void eat(Animal animalToEat) {
        if(!canEat(animalToEat) && animalToEat instanceof Canary) {
            System.out.println(super.getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            return;
        }

        String typeOfAnimal = animalToEat.getType();

        if (canEat(animalToEat) && animalToEat instanceof Shark) {
            System.out.println(super.getName() + " ate a " + typeOfAnimal + " named " + animalToEat.getName() + ".");
            System.out.println(super.getName() + ": The best meal one could wish for.");
            smellBlood(false);
        } 
        else if(canEat(animalToEat)) 
        {
            System.out.println(super.getName() + " ate a " + typeOfAnimal + " named " + animalToEat.getName() + ".");
            smellBlood(false);
        }
        else {
            System.out.println(super.getName() + ": It's not worth my time.");
        }
    }
}
