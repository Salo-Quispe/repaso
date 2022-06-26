package Mis_librerias.mis_fechas;

public class Tiempo2 {
    private int hora;
    private int minuto;
    private int segundo;
    private int milisegundo;

    //Esto es constructores sobrecargados!!!
    public Tiempo2(int hora, int minuto, int segundo,int milisegundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.milisegundo=milisegundo;
    }
    public Tiempo2(int hora,int minuto,int segundo){
        this.hora=hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public Tiempo2(int hora,int minuto){
        this.hora=hora;
        this.minuto = minuto;
    }
    public Tiempo2(int hora){
        this.hora=hora;
    }
    public Tiempo2(){
    }
}
