package lesson2.demo12;

public class Main {
    public static void main(String[] arg) {
        Archer archer = new Archer(100,20, Type.DISTANSE, "deff bonus 20%");
        GreenDragon greenDragon = new GreenDragon(300, 200, Type.FLY, "deff bonus 20%");
        Forest[] ForestUnits = {archer, greenDragon};


    }
}
