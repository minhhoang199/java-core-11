package builderDemo;

public class test {
    public static void main(String[] args) {
        Person p1 = Person.builder().withName("minh").withAge(23).withAddress("ST");
        System.out.println(p1);

        Person p2 = Person.builder().withAge(25).withAddress("STS").build();
        System.out.println(p2);
    }
}
