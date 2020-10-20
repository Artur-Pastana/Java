package Cap10.Interfaces;

public class Fatura implements Pagamento {
    
    private final String numPeca;
    private final String descPeca;
    private int qtd;
    private double precoPeca;

    public Fatura(String nPeca, String descPeca, int qtd, double preco ){
        
        if (qtd < 0) {//valida a quantidade
            throw new IllegalArgumentException("Quantidade deve ser > 0");
        }

        if (preco < 0.0) {//valida o preço do item
            throw new IllegalArgumentException("Preço deve ser > 0");
        }

        this.qtd = qtd;
        this.precoPeca = preco;
        this.numPeca = nPeca;
        this.descPeca = descPeca;
    }

    public String getNumPeca() {
        return numPeca;
    }
    public String getDescPeca() {
        return descPeca;
    }

    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        if (qtd < 0) {
            throw new IllegalArgumentException("qtd deve ser > 0");
        }
        this.qtd = qtd;
    }
    public double getPrecoPeca() {
        return precoPeca;
    }
    public void setPrecoPeca(double precoPeca) {
        if (precoPeca < 0.0) {
            throw new IllegalArgumentException("preço deve ser > 0.0");
        }
        this.precoPeca = precoPeca;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f","fatura", "Numero da peça",getNumPeca(),getDescPeca()
        , "Quantidade",getQtd(),"preço por item", getPrecoPeca());
    }

    @Override
    public double getPagamento() {
        return getPrecoPeca() * getQtd();//cacula o custo total 
    }
}