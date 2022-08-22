package other;

/**
 * @author gxh
 */
public class Person {

    private final String name;
    private final Integer age;

    public Person(String name,Integer age){
        this.age=age;
        this.name=name;
    }
    public boolean compareTo(Person p1){
        return this.age.equals(p1.age) && this.name.equals(p1.name);
    }

}
