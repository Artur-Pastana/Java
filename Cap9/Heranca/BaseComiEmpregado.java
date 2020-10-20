package Cap9.Heranca;

public class BaseComiEmpregado extends ComissaoEmpregado {
    private double salarioBase;

    public BaseComiEmpregado(double baseSalario, String nome, String sobnome, String numSocial, double vendas, double taxa){

        super(nome, sobnome, numSocial, vendas, taxa);

        if (baseSalario <= 0.0) {
            throw new IllegalArgumentException("salário deve ser > 0.0");
        }
        this.salarioBase = baseSalario;
    }
    //configura o salario
    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0.0){
            throw new IllegalArgumentException("salario deve ser > 0.0");
        }
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    //calcula os lucros
    @Override
    public double lucros() {
        return this.salarioBase + super.lucros();
    }

    //retorna a representação string da classe
    @Override
    public String toString(){
        //não permitido : tenta acessar membros private a superclasse
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","Base salarial do empregado comissionado",
                            this.nome,this.getSobreNome(),"numero do seguro social",this.getNumSeguroSocial(),
                            "vendas",this.getVendas(),"taxa de comissão",this.getComissao(),
                            "Base salarial",getSalarioBase());
    }

}