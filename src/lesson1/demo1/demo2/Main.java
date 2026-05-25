package lesson1.demo1.demo2;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.id = 1;
        user1.name = "John Doe";
        user1.status = true;
        user1.weight = 67.7;
        //System.out.println(user.id + " " + user.name + " " + user.status + " " + user.weight);
        System.out.println(user1);

        User user2 = new User(2,"Mamba",false,55.5);
        System.out.println(user2);
    }
}
