package Cap7.ArraysBidimencionais;

public class Grade {
    private String nomeCurso;//nome do curso 
    private int[][] notas;//array bidimensional de notas de aluno

    //construtor de dois argumentos incializa nome do curso e o array notas
    public Grade(String nome, int[][] matriz){
        this.nomeCurso = nome;
        this.notas = matriz;
    }

    //método para setar o nome do curso
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    //método que retorna o nome do curso
    public String getNomeCurso() {
        return nomeCurso;
    }

    //realiza as operações nos dados
    public void operarDados() {
        //gera a saida do array de notas
        imprimirArray();

        //chama os metodos getMin e getMax 
        System.out.printf("%n%s %d%n%s %d%n%n","A menor nota da grade foi:",getMin(),"A maior nota da grade foi:",getMax());

        //gera a saida do grafico de dsitruição de notas de todas as notas em todos os testes
        imprimirGrafico();
        
    }
    
    //localiza a menor nota
    public int getMin() {
        //supõe que o primeiro elemento do array é o menor
        int menorNota = notas[0][0];

        //faz um loop pelas linhas do array de notas
        for (int[] inotas : notas) {
            //faz um loop pelas colunas da linha atua
            for (int jnotas : inotas) {
                
                //se a nota for menor, atribui nota a menorNota
                if (jnotas < menorNota) {
                    menorNota = jnotas;
                }
            }
        }
        return menorNota;
    }

    //localiza a maior nota
    public int getMax() {
        int maxNota = notas[0][0];//supõe que o maior valor é o primeiro elemento

        //faz um loop pelas linhas do array de notas
        for (int[] inotas : notas) {
            
            //faz um loop pelas colunas da linha atual do array de notas
            for (int jnotas : inotas) {
                
                //se a nota for maior, atribui nota a maxNota
                if (jnotas > maxNota) {
                    maxNota = jnotas;
                }
            }
        }
        return maxNota;
    }

    //determina a media de um conjunto particular de notas
    public double getMedia(int[] setNotas) {
        int total = 0;

        //soma notas de um aluno
        for (int nota : setNotas) {
            total += nota;
        }
        double media = total/setNotas.length;
        return media;
    }

    public void imprimirGrafico() {
        
        System.out.println("Distribuição de notas");

        //armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequencia = new int[11];

        //para cada nota em notas, incrementa a frequencia apropriada
        for (int[] inotas : notas) {

            for (int jnotas : inotas) {

                ++frequencia[jnotas/10];
            }
        }

        //para casa frequencia de notas, imprime a barra no gráfico
        for(int i = 0; i < frequencia.length; i++){

            //gera a saida do rótulo de barras ("00-09: ",...,"90-99","100")
            if (i == 10) {
                System.out.printf("%5d: ",100);
            }
            else{
                System.out.printf("%2d-%2d: ", i*10, i*10+9);
            }
            for(int j = 0; j < frequencia[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //imprime o conteudo do array de notas
    public void imprimirArray() {
        System.out.printf("As Notas são:%n%n");
        System.out.print("            "); // alinha títulos de coluna
        
        //cria um titulo de coluna para cada um dos testes
        for(int test = 0; test < notas[0].length; test++){
            System.out.printf("Teste %d: ", test+1);
        }

        System.out.println("Media");

        //cria linhas/colunas de texto que representam notas de array
        for(int i = 0; i < notas.length; i++){
            System.out.printf("Estudante %2d", i+1);

            for(int test : notas[i]){//gera a saida de notas do aluno
                System.out.printf("%8d",test);
            }

            //chama o metodo getMedia para calcular a media do aluno
            //passa linha de notas como o argumento para getMedia
            double media = getMedia(notas[i]);
            System.out.printf("%9.2f%n",media);
        }
    }
}