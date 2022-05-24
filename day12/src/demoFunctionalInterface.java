@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}


//cach1: su dung class implement interface de khoi tao
public class demoFunctionalInterface implements Greeting {
    public demoFunctionalInterface() {
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Say hello " + name);
    }

    public static void main(String[] args) {
        Greeting g = new demoFunctionalInterface();
        g.sayHello("Minh");


        //cach2: anonymous class
        Greeting g1 = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hi " + name);
            }
        };
    g1.sayHello("minh1");
    }
}

