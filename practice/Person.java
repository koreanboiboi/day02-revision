package practice;

public class Person {

    private String name = "fred";

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start(Bike bike) {
        System.out.println("Starting motor bike");
    }

    public void stop(Bike bike){
        System.out.println("Stopping motor bike");

    }

    public void start(Computer pc) {
        System.out.println("Starting computer");
    }

    public void stop(Computer pc){
        System.out.println("Stopping computer");
    }

    public void start(Plane plane) {
        System.out.println("Starting plane");
    }

    public void stop(Plane plane){
        System.out.println("Stopping plane");
    }


    
    
    
}
