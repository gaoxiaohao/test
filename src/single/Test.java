package single;

public class Test {
    public static void main(String[] args) {

        Single instance = Single.getInstance();
        System.out.println(instance.toString());

        Single2 instance2 = Single2.getInstance();
        assert instance2 != null;
        System.out.println(instance2.toString());
    }
}
