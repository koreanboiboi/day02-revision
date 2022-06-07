package practice;

public class Main {


    public static void main(String[] args) {
        Person p = new Person();
        Bike bike = new Bike();
        Computer pc = new Computer();
        Plane plane = new Plane();

        System.out.printf("My name is %s\n",p.getName());
        p.start(bike);
        p.start(pc);
        p.start(plane);

        p.stop(bike);
        p.stop(pc);
        p.stop(plane);
        
    }
    
}
