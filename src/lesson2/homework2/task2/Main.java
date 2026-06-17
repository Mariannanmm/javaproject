package lesson2.homework2.task2;

public class Main {
    public static void main(String[] args) {

        Engine myEngine = new Engine(2.0, FuelType.PETROL);
        SteeringWheel myWheel = new SteeringWheel("Leather", true, true);
        Car mySummerCar = new Car("Audi", 2024, myEngine, myWheel);
        System.out.println(mySummerCar);

    }
}
