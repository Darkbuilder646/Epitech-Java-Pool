public class BlueShark extends Shark {

    protected BlueShark(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    @Override
    public boolean canEat(Animal animalToEat) {
        String typeOfAnimal = animalToEat.getType();
        switch (typeOfAnimal) {
            case "mammal":
                return false;

            case "fish":
                if(animalToEat.getName() == super.getName()) {
                    return false;
                }
                return true;

            case "bird":
                return false;
                
            default:
                return false;
        }
    }
}
