package demoOveride;

import demoOverload.Calculator;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
//        Animal a = new Animal();
////        Animal b = new Dog();
////
////        a.eat();
////        a.sound();
////
////        b.eat();
////        b.sound();
        //Ép kiểu khong tường minh
        Animal animal = new Dog();

        //Ép kiểu khong tường minh
        //Animal animal = (Animal)new Dog();

        animal.eat();
        animal.sound();

        //Array
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        for (Animal a: animals){
            a.sound();
            a.eat();
        }

        //Ep kieu ko tuong minh
        Dog dog = (Dog) animal;
        dog.eat();
        dog.sound();
    }
}
