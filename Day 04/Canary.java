public class Canary extends Animal {
    private int eggs;

    protected Canary(String nameOfAnimal) {
        super(nameOfAnimal, 2, Type.BIRD);
        this.eggs = 0;
        System.out.println("Yellow and smart? Here I am!");
    }
    
    public int getEggsCount() {
        return eggs;
    }

    public void layEgg() {
        this.eggs++;
    }
    
}
