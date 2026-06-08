package lesson4.homework4.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<User> tenUsers = new ArrayList<>();
        tenUsers.add(new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE,
                List.of(new Skill("java", 10), new Skill("js", 10)),
                new Car("toyota", 2021, 250)));
        tenUsers.add(new User(2, "Shadowheart", "Justiciar", "sh@shar.bg", 45, Gender.FEMALE,
                List.of(new Skill("Design", 7), new Skill("Photoshop", 4)),
                new Car("Mercedes", 2023, 120)));

        tenUsers.add(new User(3, "Gale", "Dekarios", "gale@mystra.bg", 35, Gender.MALE,
                List.of(new Skill("Fullstack", 10), new Skill("DevOps", 9), new Skill("Python", 6), new Skill("Docker", 8)),
                new Car("Flying Carpet", 2022, 0)));

        tenUsers.add(new User(4, "Karlach", "Cliffgate", "karlach@avernus.bg", 32, Gender.FEMALE,
                List.of(new Skill("Scrum Master", 10), new Skill("HR", 9)),
                null));

        tenUsers.add(new User(5, "Lae'zel", "of Kli'ir", "frog@vlaakith.bg", 22, Gender.FEMALE,
                List.of(new Skill("Project Management", 9)),
                new Car("Skoda", 2021, 1000)));

        tenUsers.add(new User(6, "Arthas", "Menethil", "lichking@icecrown.wow", 31, Gender.MALE,
                List.of(new Skill("SysAdmin", 10), new Skill("Linux", 10), new Skill("Networks", 9)),
                new Car("Audi", 2008, 300)));

        tenUsers.add(new User(7, "Sylvanas", "Windrunner", "banshee@undercity.wow", 2800, Gender.FEMALE,
                List.of(new Skill("CyberSecurity", 10), new Skill("Cryptography", 8)),
                new Car("Volkswagen", 2010, 150)));

        tenUsers.add(new User(8, "Thrall", "Go'el", "shaman@durotar.wow", 42, Gender.MALE,
                List.of(new Skill("TeamLead", 8), new Skill("Agile", 9), new Skill("Management", 10)),
                new Car("DS", 2004, 80)));

        tenUsers.add(new User(9, "Jaina", "Proudmoore", "jaina@dalaran.wow", 38, Gender.FEMALE,
                List.of(new Skill("Frontend", 9), new Skill("React", 9)),
                new Car("Ferrari", 2018, 1500)));

        tenUsers.add(new User(10, "Astarion", "Ancunin", "vampire@shadows.bg", 350, Gender.MALE,
                List.of(),
                null));

        System.out.println("girls only");

        Set<User> hashSet = new HashSet<>(tenUsers);
        hashSet.removeIf(user -> user.getGender() == Gender.MALE);
        for (User user : hashSet) {
            System.out.println(user.getName() + " - " + user.getGender());
        }


        System.out.println("sort by count skills");
        Comparator<User> skillCountComparator = Comparator
                .comparing((User user) -> user.getSkills().size())
                .thenComparingInt(User::getId);
        Set<User> treeSet = new TreeSet<>(skillCountComparator);
        treeSet.addAll(tenUsers);

        for (User user : treeSet) {
            System.out.println(user.getName() + " skills: " + user.getSkills().size() + " " + user.getSkills());
        }


    }
}
