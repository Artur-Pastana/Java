package Cap14;

public class Str1 {
    public static void main(String[] args) {
        
        String s1 = "Artur da Gloria";
        char[] array = new char[5];

        System.out.printf("s1: %s", s1);

        //testa o metodo length
        System.out.printf("s1 tem comprimento de: %d%n", s1.length());

        //faz um loop pelos caracteres s1
        for(int i = s1.length() - 1 ; i >= 0; i--){
            System.out.printf("%c",s1.charAt(i));
        }

        s1.getChars(0, 5, array, 0);
        System.out.printf("%nOs caracteres do array:");

        for (char c : array) {
            System.out.print(c);
        }
        System.out.println();
    }
}