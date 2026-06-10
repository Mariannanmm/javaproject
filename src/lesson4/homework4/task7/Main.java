package lesson4.homework4.task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", 150, new Owner("Vasya", 31, 10), 15000, 2018));
        cars.add(new Car("BMW", 250, new Owner("Astarion", 350, 4), 45000, 2022));
        cars.add(new Car("Audi", 200, new Owner("Gale", 35, 3), 35000, 2020));
        cars.add(new Car("Nissan", 140, new Owner("Shadowheart", 45, 2), 12000, 2015));
        cars.add(new Car("Ford", 180, new Owner("Karlach", 32, 6), 18000, 2017));
        cars.add(new Car("Honda", 160, new Owner("Lae'zel", 22, 1), 16000, 2019));
        cars.add(new Car("Mazda", 150, new Owner("Jaina", 38, 4), 20000, 2021));
        cars.add(new Car("Tesla", 300, new Owner("Arthas", 31, 12), 50000, 2023));
        cars.add(new Car("Lexus", 220, new Owner("Sylvanas", 28, 8), 40000, 2020));
        cars.add(new Car("Subaru", 210, new Owner("Thrall", 42, 2), 22000, 2016));
        cars.add(new Car("Hyundai", 120, new Owner("Olya", 26, 7), 10000, 2014));
        cars.add(new Car("Kia", 130, new Owner("Petya", 24, 2), 11000, 2015));
        cars.add(new Car("Volkswagen", 140, new Owner("Dima", 29, 3), 14000, 2016));
        cars.add(new Car("Volvo", 190, new Owner("Igor", 40, 15), 30000, 2019));
        cars.add(new Car("Porsche", 400, new Owner("Illidan", 100, 0), 95000, 2024));

        System.out.println("car-service opened " + cars);

        System.out.println(1);
        cars.stream()
                .limit(7)
                .forEach(car -> {
                    int oldPower = car.getPower();
                    int newPower = (int) (oldPower * 1.10);
                    car.setPower(newPower);
                    System.out.println(" Car: " + car.getModel() + " new power: " + car.getPower());
                });



        System.out.println(2);
        cars.stream()
                .map(Car::getOwner)
                .filter(owner -> owner.getExp()<5 && owner.getAge()>25)
                .forEach(owner -> {
                    owner.setExp(owner.getExp()+1);
                    System.out.println("Driver " + owner.getName() + " upgrade exp: " + owner.getExp());
                });

        System.out.println(3);
        int totalCarsValue = cars.stream()
                .mapToInt(Car::getPrice)
                .sum();
        System.out.println("total Cars Value: $" + totalCarsValue);


    }
}
