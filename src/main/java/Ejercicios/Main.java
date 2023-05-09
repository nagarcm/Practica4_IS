package Ejercicios;

import Ejercicio1.*;
import Ejercicio2.*;

public class Main {
    public static void main(String[] args){
        //Ejercicio 1:

        AdapterUSaRiojano r = new AdapterUSaRiojano(new UnUSRobot(20));
        System.out.println("Le velocidad el robot es: "+ r.velocidadActualEnKmh() +" km/h");
        r.salta(1);
        //Ejercicio 2:
        Alojamiento a = new Alojamiento(300);
        ServicioExtra se1 = new Excursion1(a);
        ServicioExtra se2 = new SalidaTardia(se1);
        System.out.println(se2.toString());
        System.out.println("Coste: "+se2.coste()+"€");

    }
}