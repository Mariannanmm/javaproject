package lesson2.demo2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Role role = Role.ADMIN
        //User user = new User("Biba", Role.MANAGER);

        //Helper helper = new Helper();
        //String extractToken = helper.extractToken(user);
        //System.out.println(extractToken);

        Role[] values = Role.values();
        List<Role> roles = Arrays.asList(values);
        System.out.println(Arrays.toString(values));
    }
}
