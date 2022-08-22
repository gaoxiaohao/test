package single;

public class Single {
    /**
     * 饿汉模式  未使用但已创建对象   造成浪费
     * 1.构造器私有化。防止直接创建对象
     * 2.类的内部创建对象
     * 3.向外部暴露一个静态公共方法
     */
    private String name;

    private Single(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Single{" +
                "name='" + name + '\'' +
                '}';
    }

    private static Single instance = new Single("123");

    public static Single getInstance() {
        return instance;
    }
}
