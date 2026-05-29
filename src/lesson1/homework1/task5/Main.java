package lesson1.homework1.task5;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Skoda", "kamiq", 2024, "darkGrey", "automatic", "petrol"));
        carsList.add(new Car("Audi", "A3", 2017, "white", "automatic", "diesel"));

        System.out.println("***carList***");
        for (Car car : carsList) {
            System.out.println(car);
        }
    }
}
