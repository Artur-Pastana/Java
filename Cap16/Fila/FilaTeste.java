package Cap16.Fila;

import java.util.PriorityQueue;

public class FilaTeste {
    
    public static void main(String[] args) {
        
        //fila de capacidade de 11
        PriorityQueue<Double> fila = new PriorityQueue<>();

        //insere elementos na fila
        fila.offer(3.2);
        fila.offer(28.7);
        fila.offer(12.58);

        System.out.printf("elementos da fila");

        //exibe elementos da fila
        while (fila.size() > 0) {
            System.out.printf("%.1f ",fila.peek());//visualiza o elemento superior
            fila.poll();//remove o elemento superior
        }
        System.out.println();
    }
}