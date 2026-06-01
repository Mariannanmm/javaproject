package lesson2.demo12;

public abstract class Dungeon extends Unit {

    public String bonus = "hit forest unit twice";

    public Dungeon(int dmg, int def, Type type, String bonus) {
        super(dmg, def, type);
        this.bonus = bonus;
    }
}
