package app;

public class CarMain {

    public static void whatIsMyType(Object obj){
        if (obj instanceof FlyingCar){
            System.out.println("This is my flying car");
        } else if (obj instanceof Car){
            System.out.println("This is not a flying car");
        } else{
            System.out.printf("This is a %s class\n" , obj.getClass().getName());
        }
    }

    //Main method for Car.java
    public static void main(String[] args) {
        
        //here we want to instantiate our object Car
        Car myCar = new Car();
        Car myNewCar = new Car();

        //we can then set our car property
        myCar.setColor("black");
        myNewCar.setColor("white");

        //we can also call our method
        myCar.stop();
        myNewCar.start();

        System.out.printf("My car is working? %b\n",myCar.isStarted());
        System.out.printf("My new car is working? %b\n",myNewCar.isStarted());

        myCar.start();

        System.out.printf("Should I sell my car? %b\n",myCar.isStarted());
        System.out.printf("Should I buy new car? %b\n",myNewCar.isStarted());

        myNewCar.stop();
        System.out.printf("Check any fault with engine...%b\nBought my new car!\n",myNewCar.isStarted());


        FlyingCar flyCar = new FlyingCar();
        flyCar.getAltitude();
        System.out.printf("This car is currently at altitude %d, it is not flying\n",flyCar.getAltitude());
        flyCar.setAltitude(10);
        System.out.printf("This car is currently flying at altitude %d\n",flyCar.getAltitude());
        flyCar.climb(20);
        System.out.printf("This car has rissen again and is currently at altitude %d\n",flyCar.getAltitude());

        whatIsMyType(new Car());
        whatIsMyType(new FlyingCar());
        whatIsMyType(new UnknownCar());


    }
    
}
