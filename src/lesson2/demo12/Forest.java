package lesson2.demo12;

public abstract class Forest extends Unit {
    public String buff = "deff bonus 20%";

    public Forest(int dmg, int def, Type type, String buff) {
        super(dmg, def, type);
        this.buff = buff;
    }
}
