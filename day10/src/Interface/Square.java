package Interface;

public class Square implements Ishape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public void getSideHere() {
        System.out.println("Square have 4 sides");
    }

    @Override
    public double getPerimer() {
        return side * 4;
    }

    @Override
    public void getInfo() {
        System.out.println("Side = " + side);
    }
}
