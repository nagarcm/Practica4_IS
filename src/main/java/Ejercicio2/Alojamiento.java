package Ejercicio2;

public class Alojamiento extends Servicio{
    public Alojamiento(int coste){
        this.coste = coste;
    }
    public int coste(){
        return this.coste;
    }
    @Override
    public String toString() {
        return "Servicios utilizados: alojamiento";
    }
}
