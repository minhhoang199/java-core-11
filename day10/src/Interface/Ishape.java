package Interface;

public interface Ishape {
    String name = "shape";
    //abstract method
    double getArea();
    double getPerimer();
    void getInfo();

    //Static method
    static void display(){
        //name = "other"; Không thể gán giá trị khác
        System.out.println("It is shape" + name);
    }
    //Default method
    default void getSideHere() {
        System.out.println("Shape have many side ...");
    }
}
