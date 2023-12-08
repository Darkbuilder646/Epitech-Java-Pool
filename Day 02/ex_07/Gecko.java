public class Gecko {

    private String name = "Unknown";
    private int age = 0;
    private int energy = 100;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energyOfGecko) {
        if (energyOfGecko >= 0 && energyOfGecko <= 100) {
            this.energy = energyOfGecko;
        } else if (energy < 0) {
            this.energy = 0;
        } else {
            this.energy = 100;
        }
    }

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

    public void eat(String eating) {
        eating = eating.toLowerCase();
        switch (eating) {
            case "meat":
                System.out.println("Yummy!");
                setEnergy(energy + 10);
                break;

            case "vegetable":
                System.out.println("Erk!");
                setEnergy(energy - 10);
                break;

            default:
                System.out.println("I can't eat this");
                break;
        }
    }


    public void work () {
        if (energy >= 25) {
            System.out.println("I'm working T.T");
            setEnergy(energy -= 9);
        } else if (energy <= 24) {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            setEnergy(energy + 50);
        }
    }
}
