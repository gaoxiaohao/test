package code_block;

public class CodeBlock {
    /**
     * static代码块是对类的初始化，随着类加载执行，只会执行一次
     * 普通代码块每创建一次对象就会执行一次
     * <p>
     * 1.创建对象时，类会被加载
     * 2.创建子类实例时，父类也会被加载
     * 3.调用类静态成员时会加载
     * <p>
     * 使用类静态成员时，普通代码块不会加载
     *
     * 父类静态代码块-子类静态代码块-父类普通代码块-父类构造方法-子类普通代码块-子类构造方法
     * 静态成员初始化和静态代码块同时存在，依顺序执行  先静态后普通最后构造
     * 静态代码块只能调用静态成员（变量or方法），普通代码块可以调用任意成员
     */
    public static void main(String[] args) {
        //调用类静态成员时会加载
        //Integer age = Cat.age;
        //System.out.println(age);
        //创建对象时，类会被加载 也会执行普通代码块
        //Cat cat = new Cat();
        new Cat();
    }
}
class Animal{
    static {
        System.out.println("我是动物");
    }
    {
        System.out.println("我是动物2");
    }
    public Animal(String animal){
        System.out.println("我是动物的构造函数");
    }
    //静态成员初始化和静态代码块同时存在，依顺序执行  先静态后普通最后构造
//    我是动物
//    我是动物2
//    我是动物的构造函数
//    我是一只猫
//    我是动物2
//    我是动物的构造函数
//    我是一条狗
//    傻子
}
class Cat{
    public Animal animal = new Animal("够");
    public static Animal animal1=new Animal("毛");
    static {
        System.out.println("我是一只猫");
    }
    {
        System.out.println("我是一条狗");
    }
    public Cat(){
        System.out.println("傻子");
    }
}

