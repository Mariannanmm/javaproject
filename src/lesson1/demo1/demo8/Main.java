package lesson1.demo1.demo8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //User[] users = new User[2];
        //users[0] = new User(1, "Lola");
        //users[1] = new User(2, "Kola");
        //System.out.println(Arrays.toString(users));

        //ArrayList<User> users = new ArrayList();
        //users.add(new User(1, "Loca"));
        //users.add(new User(2, "Koka"));
        //System.out.println(users);
        //System.out.println(users.get(0));

        User Moa = new User(1, "Moa");
        ArrayList<String> skills = Moa.getSkills();
        skills.add("java");
        skills.add("html");
        System.out.println(Moa);
    }
}
