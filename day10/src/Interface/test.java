package Interface;

import java.util.ArrayList;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        //Khởi tạo interface bằng class đã implement
        Ishape rectangle = new Rectangle(4, 5);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimer());
//        rectangle.getInfo();

        Ishape square = new Square(5);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimer());
//        square.getInfo();

        //Khởi tạo 1 arr
        ArrayList<Ishape> listShape = new ArrayList<>();
        listShape.add(rectangle);
        listShape.add(square);
        listShape.add(new Square(3));
        listShape.add(new Rectangle(3,2));

//        for (Ishape shape:listShape) {
//            System.out.println(shape.getArea());
//            System.out.println(shape.getPerimer());
//            shape.getInfo();
//        }

        //Sort by Aria
        ArrayList<Rectangle> listRectangle = new ArrayList<>();
        for (Ishape shape:listShape) {
            //Cach2: InstanceOf
            if (shape instanceof Rectangle){
            //if (shape.getClass().equals(rectangle.getClass())) {
                listRectangle.add((Rectangle) shape);
            }
        }
        for (Rectangle re:listRectangle
             ) {
            System.out.println(re.getArea());
        }

        //Sort
        listRectangle.sort(new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return (int)o1.getArea() - (int) o2.getArea();
            }
        });

        for (Rectangle re:listRectangle) {
            System.out.println(re.getArea());
        }

        Ishape.display();
        System.out.println(Ishape.name);

        rectangle.getSideHere();
        square.getSideHere();

    }
}
