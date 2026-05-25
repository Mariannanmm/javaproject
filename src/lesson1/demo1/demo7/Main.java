package lesson1.demo1.demo7;

public class Main {
    public static void main(String[] args) {

        //String[] skills = new String[2];
        //skills[0] = "java";
        //skills[1] = "JS";
        //User user = new User(1, "John", skills);
        //System.out.println(user);

        User user = new User (1, "Boba");
        user.addSkill(0, "html");
        user.addSkill(1, "java");
        System.out.println(user);
    }
}
