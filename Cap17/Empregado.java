package Cap17;

public class Empregado {
    
    private String nome;
    private String sobreNome;
    private double salario;
    private String departamento;

    public Empregado(String n, String sn, double sal, String dep){
        this.nome = n;
        this.sobreNome = sn;
        this.salario = sal;
        this.departamento = dep;
    }

    //configura o sobrenome
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    //obtem o sobrenome
    public String getSobreNome() {
        return sobreNome;
    }

    //configura o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    //obtem o nome
    public String getNome() {
        return nome;
    }

    //configura o salario
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //obtem o salario
    public double getSalario() {
        return salario;
    }

    //configura o departamento
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    //obtem o departamento
    public String getDepartamento() {
        return departamento;
    }

    //retorna o nome e sobrenome do empregado
    public String getNomeCompleto(){
        return String.format("%s %s", getNome(), getSobreNome());
    }

    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f   %s", getNome(), getSobreNome(), getSalario(), getDepartamento());
    }
}