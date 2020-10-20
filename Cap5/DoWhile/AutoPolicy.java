package Cap5.DoWhile;

public class AutoPolicy {
    
    private int numconta;//número da conta da apólice
    private String marcaCarro;//carro ao qual a apólice é aplicada
    private String estado;//abreviatura do estado com duas letras

    //construtor
    public AutoPolicy(int nConta, String marca, String estado){
        this.numconta = nConta;
        this.marcaCarro = marca;
        this.estado = estado;
    }

    //define a numero da conta
    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }
    //retorna o numero da conta
    public int getNumconta() {
        return numconta;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }
    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }
    public String getMarcaCarro() {
        return marcaCarro;
    }

    //método predicado é retornado se o estado tem seguros "sem culpa"
    public boolean isNoFaultState(){
        boolean noFaultState;

        //determina se o estado tem seguros de automóvel "sem culpa"
        switch (getEstado()) {//obtém a abv do estado do objeto autopolice
            case "MA": case "NJ" : case "NY": case "PA":
                noFaultState = true;
                break;
        
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }

}