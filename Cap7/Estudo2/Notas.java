package Cap7.Estudo2;

public class Notas {
    private String nomeCurso;//nome do curso que a grade representa
    private int[] notas;//array de notas do aluno

    //construtor
    public Notas(String nomeCurso, int[] matrizNotas){
        this.nomeCurso = nomeCurso;
        this.notas = matrizNotas;
    }

    //metodo para configurar o nome do curso
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    //metodo que retorna o nome do curso
    public String getNomeCurso() {
        return nomeCurso;
    }

    //realiza operações nos dados
    public void processarNotas(){
        //imprimi o array de notas
        imprimirVetor();

        //chama metodo media para calcular a nota media
        System.out.printf("Media da classe foi: %.2f%n",getMedia());

        //chama getMin e getMax
        System.out.printf("Menor Nota foi: %d%nMaior nota foi: %d%n%n",getMin(), getMax());

        //chama o metodo imprimirGrafico para mostrar a distribuição de notas
        imprimirGrafico();
    }

    //localiza a nota minima
    public int getMin(){
        int menorNota = notas[0];//supões que notas[0] é a menor nota

        //faz um loop pelo array de notas
        for (int nota : notas) {
            //se nota for mais baixa que menorNota, atribui essa nota a menorNota
            if (nota < menorNota) {
                menorNota = nota;//nota mais baixa
            }
        }
        return menorNota;
    }

    //localiza a maior nota
    public int getMax(){
        int maxNota = notas[0];//supõe que notas[0] é a maior nota

        //faz um loop pelo array de notas
        for (int nota : notas) {
            //se a nota for maior que maxNota, atribui nota a maxNota
            if (nota > maxNota) {
                maxNota = nota;
            }
        }
        return maxNota;
    }

    //determina media para o teste
    public double getMedia(){
        int tot = 0;
        double media;

        //soma as notas de u aluno
        for (int nota : notas) {
            tot += nota;
        }
        media = tot/notas.length;

        return media;
    }

    //gera a saida do grafico de barras exibindo a distribuição de notas
    public void imprimirGrafico(){
        System.out.println("Distribuição de Notas");

        //armazena frequencia e notas em cada intervalo de 10 notas
        int[] frequencia = new int[11];

        //para cada nota, incrementa a frequencia apropriada
        for (int nota : notas) {
            ++frequencia[ nota / 10];
        }
        
        //para cada frequencia de nota, imprime a barra no grafico
        for(int i = 0; i < frequencia.length; i++){
            //gera a saida do rótulo de barra ("00-09",....,"90-99","100")
            if (i == 10) {
                System.out.printf("%5d: ",100);
            }
            else{
                System.out.printf("%02d-%02d: ",i*10 , i*10+9);
            }

            for(int j = 0; j < frequencia[i]; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //imprime o conteudo do array de notas
    public void imprimirVetor() {
        System.out.println("As notas são:\n\n");

        //gera a saida das notas 
        for(int i = 0; i < notas.length; i++){
            System.out.printf("Estudante %2d:  %3d%n",(i+1),notas[i]);
        }
    }
}