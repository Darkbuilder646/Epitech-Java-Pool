public class Duet {

    static <T extends Comparable<T>> T min(T firstElement, T secondElement) {
        return (firstElement.compareTo(secondElement) < 0) ? firstElement : secondElement;
    }

    static <T extends Comparable<T>> T max(T firstElement, T secondElement) {
        return (firstElement.compareTo(secondElement) > 0) ? firstElement : secondElement;
    }
}
