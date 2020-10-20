package Cap7.ClasseArray;

import java.util.Arrays;

//metodos da classe array e System.arraycopy
public class ArrayManip {
    public static void main(String[] args) {

        //classifica arrayDouble em ordem crescente
        int[] array = {8,9,2,4,5,1,3,5,10};
        Arrays.sort(array);
        System.out.printf("%nArray ");

        for (int valor : array) {
            System.out.printf("%d ",valor); 
        }

        //preenche o array com 10 elementos com 7s
        int[] addArray  = new int[10];
        Arrays.fill(addArray, 28);
        imprimir(addArray, "AddArray");

        //copia de arrays
        int[] vet1 = {1,2,3,4,5,6};
        int[] vetCopia = new int[vet1.length];
        System.arraycopy(vet1, 0, vetCopia, 0, vet1.length);
        imprimir(vet1, "Vet1");
        imprimir(vetCopia, "vetCopia");
        
        //verifica a igualdade de vet1 e vetCopia
        boolean b = Arrays.equals(vet1, addArray);
        System.out.printf("%n%nVet1 %s VetCopia%n", (b ? "==": "!="));

        //pesquisa o valor 5 no vet1
        int loc = Arrays.binarySearch(vet1, 5);

        if (loc >= 0) {
            System.out.printf("O valor 5 é %d elemento do vet1", loc);
        }
        else{
            System.out.println("O valor 5 não está em vet1");
        }

        loc = Arrays.binarySearch(array, 2020);
        if (loc >= 0) {
            System.out.printf("O valor 2020 é %d elemento do Array", loc);
        }
        else{
            System.out.println("O valor 2020 não está em Array");
        }


    }
    public static void imprimir(int[] matriz, String desc){
        System.out.printf("%n%s: ", desc);

        for (int i : matriz) {
            System.out.printf("%d ", i);
        }
    }
}