package Zad5_2;

interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}
class MovablePoint implements Movable {

    int x;
    int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void moveUp() {
        this.x = x + 1;
    }

    @Override
    public void moveDown() {
        this.x = x - 1;
    }

    @Override
    public void moveLeft() {
      this.y = y - 1;
    }

    @Override
    public void moveRight() {
        this.y = y + 1;
    }

}

public class TestMovable {
    public static void main(String[] args){
        MovablePoint m = new MovablePoint(3,4);
        System.out.println(m);
        m.moveUp();
        m.moveLeft();
        System.out.println(m);
        m.moveDown();
        m.moveRight();
        System.out.println(m);

    }
}
