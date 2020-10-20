package Cap6.MetdosStact;

import java.util.Scanner;

public class MaxValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com 3 vablores double");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        System.out.println("maximo é :"+maximo(n1, n2, n3));
        System.out.println("A raiz quad 4 : "+Math.sqrt(4));
        
    }
    public static double maximo( double a, double b, double c){
        double maxValor = a;

        if (b > maxValor) {
            maxValor = b;
        }
        if (c > maxValor) {
            maxValor = c;
        }
        return maxValor;
    }
}