package lesson2.demo9;

public class Wrap {
    static int x;

    public Wrap(int x) {this.x = x;}

    public int getX() {return x;}

    public void setX(int x) {this.x = x;}

    static class AddOperations {

        public void addOne(){x = x +1;}
        public void addTwo() {x = x +2;}
    }

    static class RemoveOperations {

        public void removeOne() {
            x = x - 1;
        }
        public void RemoveTwo() {
            x = x - 2;
        }
    }


}
