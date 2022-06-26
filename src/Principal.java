import Mis_librerias.Financiero.Impuestos;
import Mis_librerias.Financiero.Ingresos;
import Mis_librerias.mis_fechas.Fecha;
import Mis_librerias.mis_fechas.Tiempo1;
import Mis_librerias.mis_fechas.Tiempo2;

public class Principal {
    public static void main(String[] args){
        Tiempo1 tiempo=new Tiempo1();
        Tiempo2 tiempo2= new Tiempo2(2,2,5);
        Fecha fecha1=new Fecha(1,6,34);
        Impuestos impuestos1 = new Impuestos(12);
        Ingresos ingresos = new Ingresos(1000);

        tiempo.setHora(25);
        tiempo.setMinuto(100);
        tiempo.setSegundo(100);


        System.out.println("El reloj inicial es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("en formato etsandar es: ");
        System.out.println(tiempo.toString());
        System.out.println("");

        /*System.out.println("Seteamos valores coherentes");
        tiempo.establecerTiempo(13,25,40);
        System.out.println("El reloj seteado es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("en formato etsandar es: ");
        System.out.println(tiempo.toString());
        System.out.println("");

        System.out.println("Seteamos valores incoherentes");
        tiempo.establecerTiempo(99,90,80);
        System.out.println("El reloj seteado es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("en formato etsandar es: ");
        System.out.println(tiempo.toString());
        System.out.println("");*/


    }
}
