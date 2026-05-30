package lesson2.demo10;

public class Main {
    public static void main() {

        //User First = User.getBuilder().setId(10).setName("First").build();
        //System.out.println(First);

        User.builder().id(12).name("Second").build();
        //User user1 = new User(12, "Second");
        //System.out.println(user1);





    }
}

