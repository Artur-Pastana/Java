package Cap23;

import java.security.SecureRandom;

public class PrintTask implements Runnable {
    
    private static final SecureRandom gerador = new SecureRandom();
    private final int sleepTime;//tempo de adormecimento aleatório para a thread
    private final String taskNome;

    //construtor
    public PrintTask(String nome){
        this.taskNome = nome;

        // seleciona tempo de adormecimento aleatório entre 0 e 5 segundos
        sleepTime = gerador.nextInt(5000);//milisegundos
        
        // método run contém o código que uma thread executará
    }

    public void run(){
        try {// coloca a thread para dormir pela quantidade de tempo sleepTime
            System.out.printf("%s going to sleep for %d milliseconds.%n", taskNome, sleepTime);
            Thread.sleep(sleepTime);
            
        } catch (InterruptedException exception) {
            //TODO: handle exception
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }

        // imprime o nome da tarefa
        System.out.printf("%s done sleeping%n", taskNome);
    }
}