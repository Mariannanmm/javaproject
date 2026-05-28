package lesson1.homework1.task2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium" ));
        usersList.add(new User(2, 2, "Lola", "lolamail@mail.com", "Body text 2"));
        usersList.add(new User(3, 3, "Aboba", "aboba@post.com", "Body text3"));
        usersList.add(new User(4, 4, "Noname", "noname@mail.com", "Body text4"));
        usersList.add(new User(5, 5, "Roba", "robapost@mailcom", "Body text5"));

        System.out.println("***usersList***");
        for (User user : usersList) {
            System.out.println(user);
        }
    }
}
