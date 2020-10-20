package Cap9.Heranca;

public class ComissaoEmpregado {
    
    protected final String nome; //variável protected dar acesso direto a variável de instancia da superclasse
    private final String sobreNome;
    private final String numSeguroSocial;
    private double vendas;
    private double comissao;

    //construtor de 5 argumentos
    public ComissaoEmpregado( String nome, String sobnome, String numSocial, double vendas, double taxa){
        
        //se vendas for um valor inválido lança uma execeção
        if (vendas < 0.0) {
            throw new IllegalArgumentException("Vendas precisa ser >= 0.0");
        }
        
        //se a taxa de comissão for inválida, lança uma execeção
        if (taxa <= 0.0 || taxa >= 1.0) {
            throw new IllegalArgumentException("a taxa precisa ser > 0.0 e < 1.0");
        }

        this.nome = nome;
        this.sobreNome = sobnome;
        this.numSeguroSocial = numSocial;
        this.vendas = vendas;
        this.comissao = taxa;
    }

    public String getNome() {
        return nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public String getNumSeguroSocial() {
        return numSeguroSocial;
    }
    //configura a qdt de vendas
    public void setVendas(double vendas) {
        if (vendas <= 0.0) {
            throw new IllegalArgumentException("Vendas tem serem maiores que 0.0");
        }
        this.vendas = vendas;
    }
    //retorna a qtd de vendas
    public double getVendas() {
        return vendas;
    }
    //configura a taxa de comissão
    public void setComissao(double comissao) {
        if (comissao <= 0.0 || comissao >= 1.0){
            throw new IllegalArgumentException("Comissão deve está entre 0.0 e 1.0");
        }
        this.comissao = comissao;
    }
    //retorna a comissão
    public double getComissao() {
        return comissao;
    }
    
    //calcula o lucro
    public double lucros() {
        return getComissao()*getVendas();
    }

    //retorna a representação em string da classe ComissãoEmpregado
    @Override//indica que esse método substitui um método da superclasse
    public String toString() {
        
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n","Empregado comissionado",getNome(),getSobreNome()
                            ,getNumSeguroSocial(),"Vendas",getVendas(),"taxa de comissão",getComissao());
    }
}