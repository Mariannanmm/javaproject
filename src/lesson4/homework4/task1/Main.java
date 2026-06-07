package lesson4.homework4.task1;

import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Biba", 45));
        users.add(new User(2, "Boba", 54));
        users.add(new User(3, "Aboba", 32));
        users.add(new User(4, "Baroba", 23));
        users.add(new User(5, "Kalaboba", 22));
        users.add(new User(6, "Oni", 122));

        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("By age ascending: " + users);

        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println("By age descending: " + users);


        users.sort(Comparator.comparing((User user) -> user.getName().length()));
        System.out.println("By name length ascending: " + users);


        users.sort(Comparator.comparing((User user) -> user.getName().length()).reversed());
        System.out.println("By name length descending: " + users);



    }
}
