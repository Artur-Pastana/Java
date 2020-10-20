package Cap7.Estudo2;

public class Teste {
    public static void main(String[] args) {
        
        //array de notas de aluno
        int[] vetorNotas = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        Notas minhaNota = new Notas("CS101 introdução a programação java",vetorNotas);

        System.out.printf("Quadro de notas do curso de:%n%s%n%n",minhaNota.getNomeCurso());
        minhaNota.processarNotas();
    }
}