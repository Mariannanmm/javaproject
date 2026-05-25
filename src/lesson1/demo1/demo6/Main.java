package lesson1.demo1.demo6;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"qwe", "asd", "zxc"};
        System.out.println(strings.length);
        strings[0] = "biba";
        System.out.println(strings[0]);

        System.out.println("*****1");
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            System.out.println(string);
        }

        System.out.println("*****2");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("*****3");
        int i = 0;
        while (i < strings.length) {
            System.out.println(strings[i]);
            i++;
        }
    }
}
