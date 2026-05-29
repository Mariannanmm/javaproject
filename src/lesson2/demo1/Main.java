package lesson2.demo1;

public class Main {
    public static void main(String[] args) {

        Passport passport = new Passport("wer", "123456");
        User user = new User(1, "Laura", passport);

        User user2 = new User(2, "John", "er", "2345678");

        Customer customer = new Customer("login", "password", passport);

    }
}
