package Cap20;

public class Maximo {
    public static void main(String[] args) {
        
        System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5, maximo(3, 4, 5));
    }

    public static <T extends Comparable<T>> T maximo(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;//y é o mair
        }
        if (z.compareTo(max) > 0) {
            max = z;//z é o maior
        }
        return max;
    }
}