package demoOverload;

public class Calculator {
    //2 tham so
    public int sum(int a, int b){
        return a + b;
    }

    //3 tham so
    public int sum(int a, int b, int c){
        return a + b + c;
    }

    //Thay doi kieu du lieu
    public double sum(double a, double b){
        return a + b;
    }

    public double sum(int a, double b){
        return a + b;
    }
    //Lỗi: Cùng tham số, kiểu dữ liệu, khác kiểu dữ liệu trả về
    //=> Phải có sự thay đổi số lượng tham số hoặc kiểu tham số
}
