package Ejercicio2;

public class Excursion1 extends ServicioExtra{
    public Excursion1(Servicio servicio){
        this.servicio = servicio;
        this.coste = 25;
    }
    @Override
    public int coste() {
        return this.coste + this.servicio.coste();
    }

    @Override
    public String toString() {
        return this.servicio.toString() + ", excursion 1";
    }
}
