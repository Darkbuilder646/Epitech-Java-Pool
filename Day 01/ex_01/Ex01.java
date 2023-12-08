public class Ex01 {

    public static void myConcat(String str1, String str2) {
        System.out.print(str1 + " " + str2);
    }

    public static void main(String[] args) {
        if (args.length > 1) {

            myConcat(args[0], args[1]);
        }
    }
}
