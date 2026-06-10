package lesson4.homework4.task7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String model;
    private int power;
    private Owner owner;
    private int price;
    private int year;
}
