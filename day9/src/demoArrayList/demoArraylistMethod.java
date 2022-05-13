package demoArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class demoArraylistMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("minh1");
        names.add("minh2");

        System.out.println(Arrays.toString(names.toArray()));
        //them vao 1 vi tri bat ky

        names.add(1,"minh0");
        System.out.println(Arrays.toString(names.toArray()));

        //Lay size
        System.out.println(names.size());

        //remove
        names.remove(1);
        System.out.println(Arrays.toString(names.toArray()));
        names.remove("minh");
        System.out.println(Arrays.toString(names.toArray()));

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("minh2");
        names1.add("minh3");
        names.addAll(names1);
        names.set(1, "lyly");
        System.out.println(Arrays.toString(names.toArray()));
        System.out.println(names.get(1));
    }
}
