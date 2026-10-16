class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void displayType() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void displayType() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {
    @Override
    void displayType() {
        System.out.println("This is a bike");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.displayType();

        bike.start();
        bike.displayType();
    }
}
    

