package Cap10.ClasseAbstrata;

public class BaseEmpComissionado extends EmpComissionado {
    
    private double salarioBase;//salario base por semana

    public BaseEmpComissionado(String nome, String sobNome, String nss, double vendas, double taxa, double salBase){

        super(nome, sobNome, nss, vendas, taxa);

        if (salBase < 0.0) {
            throw new IllegalArgumentException("salario Base deve ser > 0.0");
        }

        this.salarioBase = salBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("Salario base deve ser > 0.0");
        }
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double lucros() {
        
        return super.lucros() + getSalarioBase();
    }

    @Override
    public String toString() {
        
        return String.format("%s %s %s: $%,.2f","Base assaliado", super.info(),"Base salarial", getSalarioBase());
    }
}