package Cap10.ClasseAbstrata;

public class Horista extends Empregado {
    
    private double hora;//salario por hora
    private double horasTrab;//horas trabalhadas na semana

    public Horista(String nome, String sobNome, String nss, double hrs, double hrsT){

        super(nome, sobNome, nss);

        if (hrs < 0.0) {
            throw new IllegalArgumentException("Horas deve ser > 0.0");
        }

        if (hrsT < 0.0 || hrsT > 168.0) {
            throw new IllegalArgumentException("Horas trabalhadas devem ser > 0.0 e < 168.0");
        }

        this.hora = hrs;
        this.horasTrab = hrsT;
    }

    public void setHora(double hora) {
        if (hora < 0.0) {
            throw new IllegalArgumentException("Horas deve ser > 0.0");
        }
        this.hora = hora;
    }

    public double getHora() {
        return hora;
    }

    public void setHorasTrab(double horasTrab) {
        if ((horasTrab < 0.0) || (horasTrab < 168.0)) {
            throw new IllegalArgumentException("Horas trabalhadas devem ser > 0.0 e < 168.0");
        }
        this.horasTrab = horasTrab;
    }
    public double getHorasTrab() {
        return horasTrab;
    }

    //calcula os rendimentos; sobrescreve o metodo lucro de empregado
    @Override
    public double lucros() {

        if (getHora() <= 40) {//nenhuma hora extra
            return getHora() * getHorasTrab();
        }
        else{
            return 40 * getHora() + (getHorasTrab() - 40) * getHora() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Horista: %s%n%s: $%,.2f; %s: %,.2f",super.info(),"Horas",getHora(),
                            "Horas trabalhadas",getHorasTrab());

    }
}