package lesson4.demo4_hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
    //    HashSet<String> strings = new HashSet<>();
    //    strings.add("first");
    //    strings.add("second");
    //    strings.add("third");
    //    strings.add("fourth");

    //    System.out.println(strings);

        HashSet<User> users = new HashSet<>();
        users.add(new User(1, "Boba"));
        users.add(new User(2, "Biba"));
        users.add(new User(3, "Aboba"));
        users.add(new User(4, "Lola"));
        users.add(new User(5, "Rak"));
        System.out.println(users);



    }
}
