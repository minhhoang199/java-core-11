package Interface;

public class Rectangle implements Ishape{
    private double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    private double height;
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimer() {
        return (width + height)*2;
    }

    @Override
    public void getInfo() {
        System.out.printf("Width = %f, Height = %f\n",width,height);
    }
}
