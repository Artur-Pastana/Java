package Cap10.ClasseAbstrata;

public abstract class Empregado {

    private final String nome;
    private final String sobreNome;
    private final String numSegSocial;

    //construtor
    public Empregado(String nome, String sobNome, String nss){
        this.nome  = nome;
        this.sobreNome = sobNome;
        this.numSegSocial = nss;

    }

    public String getNome() {
        return nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public String getNumSegSocial() {
        return numSegSocial;
    }

    public String info() {
       return String.format("Nome:%s %s%nNumero de seguro social: %s%n", getNome(), getSobreNome(), getNumSegSocial());
    }

    public abstract double lucros();

}