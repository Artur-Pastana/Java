package Cap4.condicionais;

public class TesteEstud {
    public static void main(String[] args) {
        Estudante est1 = new Estudante("artur", 89.10);
        Estudante est2 = new Estudante("iris", 90);

        System.out.printf("O aluno(a): %s%ntem a media: %s%n",est1.getNome(), est1.imprimirNota());
        System.out.println();
        System.out.printf("O aluno(a): %s%ntem a media: %s%n", est2.getNome(), est2.imprimirNota());
    }
}