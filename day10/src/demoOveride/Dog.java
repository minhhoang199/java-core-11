package demoOveride;

public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sound() {
        System.out.println("go go");
    }
}
