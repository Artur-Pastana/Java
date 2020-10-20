package Cap15.Serializacao;

import java.io.Serializable;

public class Conta implements Serializable {

    private int conta;
    private String nome;
    private String sobreNome;
    private double salario;

    //construtor que inicializa uma conta com os valores pradrões
    public Conta(){
        this.conta = 0;
        this.nome = "";
        this.sobreNome = "";
        this.salario = 0.0;
    }

    //inicializa conta com os valores fornecidos
    public Conta(int conta, String nome, String sobNome, double valor){
        this.conta = conta;
        this.nome = nome;
        this.sobreNome = sobNome;
        this.salario = valor;
    }

    //configura o numero da conta
    public void setConta(int conta) {
        this.conta = conta;
    }
    //pega o numero da conta
    public int getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public String getSobreNome() {
        return sobreNome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}