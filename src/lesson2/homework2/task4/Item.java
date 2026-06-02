package lesson2.homework2.task4;

public abstract class Item {
    private int id;


    public Item() {}

    public Item(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
