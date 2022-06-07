package app;

public class Car{

    //variable for this class called
    private String color;
    private boolean started = false;

    //constructor is used to initialize the object when instantiated
    public Car(){
        
    }
    //Function to read and update members (getters and setters)
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isStarted(){
        return this.started;
    }

    //methods
    public void start(){
        this.started = true;
    }

    public void stop(){
        this.started = false;
    }

}