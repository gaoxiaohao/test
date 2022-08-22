package abstracts;

/**
 * @author gxh
 */
public class Abstracts {

    public static void main(String[] args) {

    }

    /**
     * 抽象类不能被实例化
     * 抽象类可以没有抽象方法
     * 一旦一个类包含了抽象方法，这个类必须声明为抽象类
     * abstract只能修饰类和方法
     * 抽象类本质还是类
     * 一个类继承了抽象类，它必须实现抽象类的所有抽象方法，除非它本身也为抽象类
     * 抽象方法不能使用private  final static修饰，这些关键字是和重写相违背的
     * 抽象类不能使用final修饰
     * */
    abstract  class Animal{

        private String name;

        public Animal(String name) {
            this.name = name;
        }
        public Animal() {

        }

        /**
         * e
         * */
        public abstract void eat();
    }

    class Cat extends Animal{
        @Override
        public void eat() {

        }
    }
}
