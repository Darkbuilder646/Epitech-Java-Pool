public class Gecko {

    private String name = "Unknown";

    public String getName() {
        return name;
    }

    public Gecko() {
        System.out.println("Hello!");
    }

    public Gecko(String geckoName) {
        name = geckoName;
        System.out.println("Hello " + name + "!");
    }
    
}
