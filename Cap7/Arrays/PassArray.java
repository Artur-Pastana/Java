package Cap7.Arrays;

public class PassArray {
    public static void main(String[] args) {
        
        int[] vetor = {1,2,3,4,5};

        System.out.printf("Efeitos da passagem por referencia no vetor%n"+"O valor original do vetor%n");

        //gera gera saida do vetor original
        for(int valor : vetor){
            System.out.printf(" %d", valor);
        }

        modificarArray(vetor);//pasa a referencia do vetor
        System.out.printf("%n%nO valor modificado do Vetor é:%n");

        //gera a saida de elementos do vetor modificado
        for(int valor : vetor){
            System.out.printf(" %d", valor);
        }

        System.out.printf("%n%nEfeitos da passagem por referencia no vetor%n"+"vetor[3] foi modificado: %d%n",vetor[3]);

        modificarElemento(vetor[3]);//tenta modificar o vetor[3]
        System.out.printf("Vetor[3] foi modificado: %d%n" , vetor[3]);

    }

    //metodo estático que multiplica cada elemento de um array por 2
    public static void modificarArray(int[] vetor) {
        for(int i = 0; i < vetor.length; i++){
            vetor[i] *= 2;
        }
    }

    //multiplica argumento por 2
    public static void modificarElemento(int elemento) {
        elemento *= 2;
        System.out.printf("Valor do elemento foi modificado: %d%n", elemento);
    }
}