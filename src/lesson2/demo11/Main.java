package lesson2.demo11;

public class Main {
    public static void main(String[] args) {

    //    User user = new User(1, "first");
    //    User user2 = new User("identificator", "second");

    //    User[] users = {user, user2};

    //    for (User u = users) {
    //        if (u.id instanceof String) {
    //            String id = (String) u.id;
    //        }
    //    }

        User<String> stringUser = new User<>("identificator", "First");
        User<Integer> integerUser = new User<>(2, "Second");

        User[] users = {stringUser, integerUser};
        for (User user : users) {
            if (user.id instanceof String) {
                System.out.println(((String) user.id).contains("identificator"));
            }

        }





    }
}
