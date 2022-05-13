package demo;

public class Main {
    public static void main(String[] args) {
        // Định nghĩa các biến thuộc kiểu dữ liệu nguyên thủy
        int a = 5;
        double b = 5.65;

        // Chuyển đổi thành wrapper objects tương ứng
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if(aObj instanceof Integer) {
            System.out.println("Một object thuộc Integer đã được tạo: " + aObj);
        }

        if(bObj instanceof Double) {
            System.out.println("Một object thuộc Double đã được tạo: " + bObj);
        }

        // Chuyển đổi thành kiểu dữ liệu nguyên thủy tương ứng
        int a1 = aObj.intValue();
        double b1 = bObj.doubleValue();

        System.out.println("Giá trị a = " + a1);
        System.out.println("Giá trị b = " + b1);
    }
}
