public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.abs(-8.0));
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.floor(-1.1));
        System.out.println(Math.round(1.1));
        System.out.println(Math.round(1.9));
        System.out.println(Math.pow(2,9));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.random());//random 1 so trong khoang (0, 1)
        //random: Math.random * (max - min + 1) + min
        System.out.println((int)Math.ceil(Math.random()*11));
    }
}
