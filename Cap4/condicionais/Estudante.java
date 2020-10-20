package Cap4.condicionais;
//class que armazena o nome e a media do aluno

public class Estudante {
    private String nome;
    private double media;

    //construtor que inicializa as variaveis nome e media
    public Estudante(String nome, double valor){
        this.nome = nome;

        if (valor >= 0.0 && valor <= 100) {
            this.media = valor;
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        if (media >= 0.0 && media <= 100) {
            this.media = media;
        }
    }

    public String imprimirNota() {
        String letra = "";
        if (this.media >= 90.0) {
            letra = "A";
        }else if (this.media >= 80.00) {
            letra = "B";
        }else if (this.media >= 70.0) {
            letra = "C";
        }else if (this.media >= 60) {
            letra = "D";
        }else{
            letra = "F";
        }
        return letra;
    }
}