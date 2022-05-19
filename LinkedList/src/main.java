import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(21);

        System.out.println(numbers.toString());

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set.toString());

        int max = Collections.max(numbers);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers.toString());
    }
}
