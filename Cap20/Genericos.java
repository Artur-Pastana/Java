package Cap20;

import java.util.Arrays;

public class Genericos {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6};
        Character[] charArray = {'A','R','T','U','R'};

        System.out.printf("Array de integer: %n");
        mostrar(intArray);
        System.out.println("Array de Double:");
        mostrar(doubleArray);
        System.out.println("Array de Char:");
        mostrar(charArray);

        System.out.printf("%s %n",Arrays.toString(intArray));
        mostrar(intArray);
        mostrarArray(charArray);
        
    }
    //método com paramentro Object
    public static void mostrarArray(Object[] array) {
        for (Object elementos : array) {
            System.out.printf("%s ", elementos);
        }System.out.println();
    }

    //método genérico
    public static <T> void mostrar(T[] array) {
        //exibe os elementos
        for (T elementos : array) {
            System.out.printf("%s ", elementos);
        }
        System.out.println();
    }

    public static void mostrar(Integer[] inputArray) {
        
        //exibe os elementos do array
        for (Integer elementos : inputArray) {
            System.out.printf("%s ", elementos);
        }
        System.out.println();
    }

    public static void mostrar(Double[] array) {
        for (Double elementos : array) {
            System.out.printf("%s ", elementos);
        }
        System.out.println();
    }

    public static void mostrar(Character[] array) {
        for (Character elementos : array) {
            System.out.printf("%s ", elementos);
        }
        System.out.println();
    }
}