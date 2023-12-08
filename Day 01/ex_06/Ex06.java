public class Ex06 {

    // public static void main(String[] args) {
    //     sequence(10);
    // }

    public static void sequence(int nbr) {
        if (nbr < 0) {
            return;
        }

        String result = "1";

        if (nbr == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < nbr + 1; i++) {
            System.out.println(result);
            result = generateNext(result);
        }
    }

    public static String generateNext(String input) {
        int count = input.length();
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < count) {
            char digit = input.charAt(i);
            int countSame = 1;

            while (i + 1 < count && input.charAt(i) == input.charAt(i + 1)) {
                countSame++;
                i++;
            }

            result.append(countSame).append(digit);
            i++;
        }

        return result.toString();
    }

}
