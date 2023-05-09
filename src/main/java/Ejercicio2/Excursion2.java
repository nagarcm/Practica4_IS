package Ejercicio2;

public class Excursion2 extends ServicioExtra{
    public Excursion2(Servicio servicio){
        this.servicio = servicio;
        this.coste = 50;
    }
    @Override
    public int coste() {
        return this.coste + this.servicio.coste();
    }
    @Override
    public String toString() {
        return this.servicio.toString() + ", excursion 2";
    }
}
