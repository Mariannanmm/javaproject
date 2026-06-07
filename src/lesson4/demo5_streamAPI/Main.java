package lesson4.demo5_streamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>() {
        };
        users.add(new User(1, "Blobs"));
        users.add(new User(2, "Boobs"));
        users.add(new User(3, "Alobs"));
        users.add(new User(4, "Babas"));
        users.add(new User(5, "Cabas"));
        users.add(new User(4, "Babas"));
        users.add(new User(5, "Cabas"));


    //    System.out.println(users);
    //    Iterator<User> iterator = users.iterator();
    //    while (iterator.hasNext()) {
    //        User next = iterator.next();
    //        if (next.getId()==2) {
    //            iterator.remove();
    //        }
    //    }
    //    users.removeIf(user -> false);
        System.out.println(users);

    //    Stream<User> stream = users.stream();
    //    List<User> collect = stream
    //            .distinct()
    //            .sorted((o1, o2) -> o1.getId()- o2.getId())
    //            .collect(Collectors.toList());
    //    System.out.println(collect);
        users.stream()
                .distinct()
                .map(user -> new CutedUser(user.getName()))
                .collect(Collectors.toList())
                .forEach(cutedUser -> System.out.println(cutedUser));




    }
}
