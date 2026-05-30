package lesson2.demo8;

public class Wrap {
    private int x;

    public Wrap(int x) {this.x = x;}

    public int getX() {return x;}

    public void setX(int x) {this.x = x;}

    class AddOperations {
        public void addOne(){
            x = x +1;
        }
        public void addTwo() {
            x = x +2;
        }
    }
    class RemoveOperations {

        public void removeOne() {
            x = x - 1;
        }
        public void RemoveTwo() {
            x = x - 2;
        }
    }
}
