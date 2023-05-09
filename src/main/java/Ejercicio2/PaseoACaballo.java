package Ejercicio2;

public class PaseoACaballo extends ServicioExtra{
    public PaseoACaballo(Servicio servicio){
        this.servicio = servicio;
        this.coste = 100;
    }
    @Override
    public int coste() {
        return this.coste + this.servicio.coste();
    }
    @Override
    public String toString() {
        return this.servicio.toString() + ", paseo a caballo";
    }
}
