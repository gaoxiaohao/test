package other;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("gxh",132);
        Person person1 = new Person("gxh",12);
        boolean b = person.compareTo(person1);
        System.out.println(b);
    }
}
