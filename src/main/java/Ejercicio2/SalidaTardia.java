
package Ejercicio2;

public class SalidaTardia extends ServicioExtra{
    public SalidaTardia(Servicio servicio){
        this.servicio = servicio;
        this.coste = 75;
    }
    @Override
    public int coste() {
        return this.coste + this.servicio.coste();
    }
    @Override
    public String toString() {
        return this.servicio.toString() + ", salida tardia";
    }
}