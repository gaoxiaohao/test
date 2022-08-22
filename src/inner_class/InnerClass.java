package inner_class;

public class InnerClass {

    public static void main(String[] args) {
        outer outer = new outer();
        outer.full();
        outer.full1();
    }

    public Integer other;
}

//外部类
class outer {
    private int anInt = 1;
    private String other = "sss";

    /**
     * 内部类分为四种：
     * 局部内部类-有类名 在方法或者代码块中
     * 匿名内部类-没有类名
     * 成员内部类
     * 静态内部类
     */
    //局部内部类在方法中
    public void full() {
        //可以使用final修饰，但不可使用public
        final class Inner {
            public void pen() {
                //可以访问外部类所有成员，包括私有
                System.out.println("数值为：" + anInt + other);
            }
        }
        //创建当前对象
        Inner inner = new Inner();
        inner.pen();
    }

    //匿名内部类简化开发
    //close的编译类型是open   运行类型是匿名内部类
    //匿名内部类是程序自己命名内部类名称，一般为外部类+$1
    //匿名内部类使用一次不再使用，但创建的对象可多次使用
    public void full1() {
        open close = new open() {
            @Override
            public void crazy() {
                System.out.println("黄艳梅女士");
            }
        };
        close.crazy();
        System.out.println("获取匿名内部类名称"+close.getClass());
    }

    interface open {
        void crazy();
    }

}