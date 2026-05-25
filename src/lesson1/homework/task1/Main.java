package lesson1.homework.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> usersList = new ArrayList<>();
        usersList.add(new User(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
        usersList.add(new User(2, 2, "Second Title", "Body text 2"));
        usersList.add(new User(3, 3, "Third Title", "Body text 3"));
        usersList.add(new User(4, 4, "Fourth Title", "Body text 4"));
        usersList.add(new User(5, 5, "Fifth Title", "Body text 5"));

        System.out.println("***usersList***");
        for (User user : usersList) {
            System.out.println(user);
        }
    }
}
