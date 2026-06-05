package lesson4.demo3_treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    //   Set<String> strings = new TreeSet<>();
    //    strings.add("a");
    //    strings.add("c");
    //    strings.add("a");
    //    strings.add("b");
    //    System.out.println(strings);

        Set<User> users = new TreeSet<>();
        users.add(new User(1, "Biba"));
        users.add(new User(4, "Aboba"));
        users.add(new User(3, "Boba"));
        users.add(new User(2, "Robb"));

        System.out.println(users);




    }
}
