public class Cat extends Animal {
    private String color;

    protected Cat(String nameOfCat) {
        super(nameOfCat, 4, Type.MAMMAL);
        this.color = "grey";
        System.out.println(nameOfCat + ": MEEEOOWWWW");
    }
    
    protected Cat(String nameOfCat, String colorOfCat) {
        super(nameOfCat, 4, Type.MAMMAL);
        this.color = colorOfCat;
        System.out.println(nameOfCat + ": MEEEOOWWWW");
    }
    
    public void meow() {
        System.out.println(super.getName() + " the " + this.color + " kitty is meowing.");
    }
    
    public String getColor() {
        return color;
    }
}
