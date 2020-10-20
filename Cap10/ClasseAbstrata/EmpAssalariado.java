package Cap10.ClasseAbstrata;

public class EmpAssalariado extends Empregado {

    private double salario;

    //construtor
    public EmpAssalariado(String nome, String sobnome, String nss, double sal){
        super(nome, sobnome, nss);

        if (sal < 0.0) {
            throw new IllegalArgumentException("salario deve ser > 0.00");
        }
        this.salario = sal;
    }

    public void setSalario(double salario) {
        if (salario < 0.0) {
            throw new IllegalArgumentException("salario deve ser > 0.00");
        }
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double lucros() {
        return getSalario();
    }

    @Override
    public String toString() {
        
        return String.format("Empregado Assalariado: %s%n%s: $%.2f",super.info(),"salario trabalhado",getSalario());
    }
    
}