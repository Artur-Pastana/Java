package Cap7.ArraysBidimencionais;



public class GradeTeste {
    public static void main(String[] args) {
        
        //array bidimencional de notas de aluno
        int[][] matrizNotas = { {87, 96, 70},
                                {68, 87, 90},
                                {94, 100, 90},
                                {100, 81, 82},
                                {83, 65, 85},
                                {78, 87, 65},
                                {85, 75, 83},
                                {91, 94, 100},
                                {76, 72, 84},
                                {87, 93, 73}};

        Grade minhaGrade = new Grade("introdução a programação Java", matrizNotas);

        System.out.printf("Bem vindo a grade de notas:%n%s%n%n", minhaGrade.getNomeCurso());
        minhaGrade.operarDados();
    }
}