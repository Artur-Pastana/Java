package Cap10.ClasseAbstrata;

public class EmpComissionado extends Empregado {
    
    private double vendas;//vendas brutas semanais
    private double comissao;//porcentagem de comissao

    public EmpComissionado(String nome, String sobNome, String nss, double vendas, double taxa){

        super(nome, sobNome, nss);

        if (vendas < 0.0) {
            throw new IllegalArgumentException("vendas devem ser >= 0.0");
        }

        if (taxa <= 0.0 || taxa >= 1.0) {
            throw new IllegalArgumentException("taxa deve está entre 0.0 e 1.0");
        }

        this.vendas = vendas;
        this.comissao = taxa;
    }

    public void setComissao(double comissao) {
        if (comissao <= 0.0 || comissao >= 1.0) {
            throw new IllegalArgumentException("taxa deve está entre 0.0 e 1.0");
        }
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setVendas(double vendas) {

        if (vendas < 0.0) {
            throw new IllegalArgumentException("vendas devem ser >= 0.0");
        }
        this.vendas = vendas;
    }

    public double getVendas() {
        return vendas;
    }

    //calcula os rendimentos; sobrescreve o metodo de empregado
    @Override
    public double lucros() {
        return getVendas() * getComissao();
    }

    @Override
    public String toString() {
        
        return String.format("%s: %s%n%s: $%.2f %s: %.2f","Empregado Comissionado",super.info(),"Vendas", getVendas()
                            , getVendas(),"Taxa de comissão",getComissao());
    }
}