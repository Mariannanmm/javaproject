package lesson2.homework2.task3;

public class Main {
    public static void main(String[] args) {
        Skill[] vasyaSkills = new Skill[3];
        vasyaSkills[0] = new Skill("java", 10);
        vasyaSkills[1] = new Skill("js", 10);
        vasyaSkills[2] = new Skill("c++", 10);

        Car vasyaCar = new Car("toyota", 2021, 250);

        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, vasyaSkills, vasyaCar);
        System.out.println(user);
    }
}
