package Ejercicio1;

public class AdapterUSaRiojano implements RiojaRobotsInterface {
    private USRobotsInterface USRobot;

    public AdapterUSaRiojano(UnUSRobot robotUS){
        this.USRobot = robotUS;
    }
    public double velocidadActualEnKmh(){
        return this.USRobot.currentSpeedInMilesPerHour()*1.6;
    }
    public void salta(double distanciaMetros){
        this.USRobot.jump(distanciaMetros/0.3);
    }

}