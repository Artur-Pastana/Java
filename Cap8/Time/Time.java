package Cap8.Time;

import javax.crypto.interfaces.PBEKey;

public class Time {
    
    private int horas;
    private int minutos;
    private int segundos;

    //sobrecargas de construtores
    public Time(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Time(int horas){
        this.horas = horas;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Time(int hora, int min){
        this.horas = hora;
        this.minutos = min;
        this.segundos = 0;
    }

    public Time(int hora, int min, int seg){
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("Hora de 0 - 23");
        }
        if (min < 0 || min >= 60) {
            throw new IllegalArgumentException("Minutos de 0 - 59");
        }
        if (seg < 0 || seg >= 59) {
            throw new IllegalArgumentException("Segundo de 0 - 59");
        }

        this.horas = hora;
        this.minutos = min;
        this.segundos = seg;    
    }
    //construtor time, com outro objeto time como argumento
    public Time(Time tempo){
        this(tempo.getHoras(), tempo.getMinutos(), tempo.getSegundos());
    }

    public void setHoras(int horas) {
        if (horas < 0 || horas >= 24) {
            throw new IllegalArgumentException("Horas de 0 - 23");
        }
        this.horas = horas;
    }


    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos >= 60){
            throw new IllegalArgumentException("minutos de 0 - 59");
        }
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos >= 59) {
            throw new IllegalArgumentException("segundos de 0 - 59");
        }
        this.segundos = segundos;
    }
    //retorna os valores das variáveis de instancia
    public int getHoras() {
        return horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }

    // configura um novo valor de tempo usando hora universal; lança uma
    // exceção se a hora, minuto ou segundo for inválido
    public void setTime(int hora, int min, int seg) {
        //valida hora, minuto e segundo
        if (hora < 0 || hora >=24 || min < 0 || min >= 60 || seg < 0 || seg >= 60) {
            throw new IllegalArgumentException("horas, minutos e segundos fora dos intervalos");

        }
        this.horas = hora;
        this.minutos = min;
        this.segundos = seg;
    }

    //converte em String no formato de data/hora universal (HH:MM:SS)
    public String universalString() {
        return String.format("%02d:%02d:%02d",getHoras(),getMinutos(), getSegundos());
    }

    // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((this.horas == 0 || this.horas == 12) ? 12 : this.horas % 12),
                                                this.minutos,this.segundos,(this.horas < 12 ? "AM" : "PM"));
        
    }
}