package enums;

/**
 * @author 高志浩
 * @version 1.0
 * enum会隐式继承Enum类，可使用Enum类的方法
 */
enum Enums {
    //常量名称（实参列表）必须写在第一行
    //SPRING  替代  public static final Enums SPRING = new Enums("","");
    SPRING("1","1"),SUMMER("",""),WINTER("","");
    private final String name;
    private final String node;

    Enums(String name, String node) {
        this.name = name;
        this.node = node;
    }

    public String getName() {
        return name;
    }

    public String getNode() {
        return node;
    }

    @Override
    public String toString() {
        return "Enums{" +
                "name='" + name + '\'' +
                ", node='" + node + '\'' +
                '}';
    }
}
