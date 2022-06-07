package app;

//inheriting from Car class
public class FlyingCar extends Car {

    //we can then add additional attribute besides from the already defined ones from Car
    private int altitude = 0;

    //overload constructor to provide different instantiation option
    public FlyingCar(){

    }
    public FlyingCar(String color){
        this.setColor(color);
    }

    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    
    public void climb(int height) {
        this.altitude += height;
    }
}
