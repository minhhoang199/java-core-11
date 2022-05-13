package demoArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //for
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + "\t");
        }
        System.out.println("");

        //foreach
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println("");


        //iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println("");

        //list Iterator
        ListIterator<Integer> iterator1 = numbers.listIterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + "\t");
        }

        System.out.println("");

        //lambda
        numbers.forEach(number -> System.out.print(number));
        System.out.println("");
        //Method
        numbers.forEach(System.out::print);
    }
}
