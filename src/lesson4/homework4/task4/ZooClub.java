package lesson4.homework4.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    public void addPerson(Person person) {
        club.put(person, new ArrayList<>());
        System.out.println("member " + person.getName() + " added successfully");
    }

    public void addPetToPerson(Person person, Pet pet) {
        if (club.containsKey(person)) {
            club.get(person).add(pet);
            System.out.println("Pet " + pet.getName() + " added to owner" + person.getName());
        } else {
            System.out.println("owner is not a member of club");
        }}

    public void removePetFromPerson(Person person, Pet pet) {
        if (club.containsKey(person)) {
            boolean removed = club.get(person).remove(pet);
            if (removed) {
                System.out.println("Pet " + pet.getName() + " deleted from" + person.getName());
            } else {
                System.out.println("not owner");
            }
        }}
    public void removePerson(Person person) {
        club.remove(person);
        System.out.println("Member " + person.getName() + " deleted from club");
    }
    public void removePetFromAll(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.removeIf(p -> p.equals(pet));
        }
        System.out.println("Pet " + pet.getName() + " deleted from all possible owners");
    }
    public void printClub() {
        System.out.println("***CLUB***");
        if (club.isEmpty()) {
            System.out.println("***CLUB IS EMPTY***");
        } else {
            club.forEach((person, pets) -> {
                System.out.println(person.getName() + " (ID: " + person.getId() + ") is owner: " + pets);
            });
        }
    }


}
