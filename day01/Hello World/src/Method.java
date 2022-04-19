public class Method {
    //In ra dòng chữ: Xin chào các bạn.
    public void sayHi() {
        System.out.println("Xin Chào các bạn");
    }

    //In ra dòng chữ : Xin chào X (với X là một chuỗi bất kỳ, nhập vào tham số khi gọi method).
    public void sayHello1(String name) {//parameter
        System.out.println("Xin chào " + name);
    }

    //In ra dòng chữ : Xin chào “X” (với X là một chuỗi bất kỳ, nhập vào tham số khi gọi method).
    public void sayHello2(String name) {//parameter
        System.out.println("Xin chào \"" + name + "\"");
    }

    //Tính tổng 2 số a, b bất kỳ.
    public int sum(int a, int b) {
        return a + b;
    }

    //Tính bình phương 1 số bất kỳ.
    public int calculateSquare(int a) {
        return (int) Math.pow(a,2);
    }

    //Tính thế kỷ của 1 năm bất kỳ (năm là 1 số nguyên dương).
    public int calculateCentury(int a) {
        return (int)Math.floor(a / 100) + 1;
    }

    //Test
    public static void main(String[] args) {
        Method m = new Method();

        m.sayHi();

        m.sayHello1("Minh");

        m.sayHello2("Minh");

        int sum = m.sum(10, 20);
        System.out.println(sum);

        System.out.println(m.calculateSquare(3));

        System.out.println(m.calculateCentury(2022));
    }
}
