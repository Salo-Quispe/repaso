package Mis_librerias.mis_fechas;

public class Tiempo1 {
    private int hora;
    private int minuto;
    private int segundo;

    public void establecerTiempo(int h, int m, int s) {
        hora = (h>=0&&h<24)?h:0;
        minuto = (m>=0&&m<60)?m:0;
        segundo = (s>=0&&s<60)?s:0;
    }

    public void setHora(int h) {
        hora = (h>=0&&h<24)?h:0;
        this.hora = hora;
    }

    public void setMinuto(int m) {
        minuto = (m>=0&&m<60)?m:0;
        this.minuto = minuto;
    }

    public void setSegundo(int s) {
        segundo = (s>=0&&s<60)?s:0;
        this.segundo = segundo;

    }

    public String aStringUniversal (){
        return String.format("%02d:%02d:%2d",hora,minuto,segundo);
    }

    public String toString(){
        return String.format("%02d:%02d:%2d",((hora==0||hora==12)?12:hora%12),minuto,segundo,(hora<12? "AM":"PM"));
    }
}
