public class HomeWord2 {
    public static double calculateBMI(double weight, double height) {
        double result = weight/Math.pow(height/100, 2);//height(cm)
        //Làm tròn đến chữ số thập phân thứ 2
        return (Math.round(result*100.0)) / 100.0;
    }

    //test
    public static void main(String[] args) {
        System.out.println(calculateBMI(62, 165));
    }
}
