package Cap14;

public class Str2 {
    public static void main(String[] args) {
        
        StringBuilder buffer = new StringBuilder("artur da gloria");

        System.out.printf("buffer: %s%n", buffer.toString());
        System.out.printf("caractere 0: %s%ncaractere 6: %s%n",buffer.charAt(0),buffer.charAt(6));

        char[] array = new char[buffer.length()];
        buffer.getChars(0, buffer.length(),array, 0);
        System.out.printf("Os caracteres são: ");

        for (char c : array) {
            System.out.print(c);
        }
        System.out.println();
        buffer.setCharAt(0, 'A');
        buffer.setCharAt(6, 'D');
        System.out.printf("%nBuffer: %s",buffer.toString());

        buffer.reverse();
        System.out.printf("%nBuffer: %s",buffer.toString());
        System.out.println();


    }
}