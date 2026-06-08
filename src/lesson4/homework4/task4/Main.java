package lesson4.homework4.task4;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Person biba = new Person(1, "Biba");
        Person boba = new Person(2, "Boba");

        Pet cat = new Pet("Tolik", "Cat");
        Pet dog = new Pet("Barabaka", "Dog");
        Pet parrot = new Pet("Pirate", "Parrot");

        zooClub.addPerson(biba);
        zooClub.addPerson(boba);
        zooClub.printClub();

        zooClub.addPetToPerson(biba, cat);
        zooClub.addPetToPerson(biba, dog);
        zooClub.addPetToPerson(boba, dog);
        zooClub.addPetToPerson(boba, parrot);
        zooClub.printClub();

        zooClub.removePetFromPerson(biba, cat);
        zooClub.printClub();


        zooClub.removePetFromAll(dog);
        zooClub.printClub();


        zooClub.removePerson(boba);
        zooClub.printClub();
    }


}
