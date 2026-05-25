package lesson1.demo1.demo6;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private boolean status;
    private double weight;

    public String greeting (String msg){
        return msg + " my name is - " + this.name;
    }

}
