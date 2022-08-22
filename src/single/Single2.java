package single;

public class Single2 {
    /**
     * 懒汉单例模式
     * 1.构造器私有化
     * 2.设置静态对象变量
     * 3.编写getInstance函数  判断当前对象是否为空
     * 只有当用户创建对象的时候，才会去创建；类加载时不会创建
     * */
    private final String name;
    private static Single2 cat;

    private Single2(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Single2 getInstance(){
        if (cat==null){
            return new Single2("job");
        }
        return null;
    }

}

