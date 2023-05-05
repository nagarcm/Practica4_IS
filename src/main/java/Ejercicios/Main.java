package Ejercicios;


public class Main {
    public static void main(String[] args){
        AdapterUSaRiojano r = new AdapterUSaRiojano(new UnUSRobot(20));
        System.out.println("Le velocidad el robot es: "+ r.velocidadActualEnKmh() +" km/h");
        r.salta(1);
    }
}