package lesson3.demo6_common_fnctional_intrfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Admin {
    private String name;
    private String login;
    private String password;
}
