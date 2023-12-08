import java.util.ArrayList;

public class Ex05 {

    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> argsList = new ArrayList<>();
        for (String arg : var) {
            argsList.add(arg);
        }
        return argsList;
    }

    // public static void main(String[] args) {
    //     ArrayList<String> arguments = myGetArgs("C#", "React", "Java", "PHP", "C++");
    //     System.out.println(arguments);
    // }
}
