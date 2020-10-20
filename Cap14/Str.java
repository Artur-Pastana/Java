package Cap14;

public class Str {
    public static void main(String[] args) {
        
        char[] charArray = {'a','r','t','u','r',' ','d','a',' ','g','l','o','r','i','a'};
        String s = new String("Hello");

        //utiliza os construtores String
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray,8,7);

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1,s2,s3,s4);
    }
}