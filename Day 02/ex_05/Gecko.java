public class Gecko {

    private String name = "Unknown";
    private int age = 0;

    public int getAge() {
        return age;
    }

    public void setAge(int ageOfGecko) {
        this.age = ageOfGecko;
    }

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

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public void status() {
        switch (age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;

            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;

            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;

            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;

            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }

    public void hello(String geckoName) {
        System.out.println("Hello " + geckoName + ", I'm " + name + "!");
    }

    public void hello(int nbr) {
        for (int i = 0; i < nbr; i++) {
            System.out.println("Hello, I'm " + name + "!");
        }
    }
}
