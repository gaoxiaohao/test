package interfaces;

import javax.crypto.interfaces.PBEKey;

/**
 * @author gxh
 */
public interface Interfaces {

    /**
     * 接口中可以存在 抽象方法， 静态实现方法    普通实现方法（需要加default）
     * 接口不允许被实例化
     * 接口中所有方法都是public方法，可以不用abstract修饰
     * 抽象类实现接口，可以不用实现接口中的方法
     * 一个类可以实现多个接口
     * 接口中的属性默认是public static final
     * 接口中属性访问方式：接口名.属性名
     * 一个接口可以继承多个接口
     * 接口的修饰符public和默认，和类的修饰符一样
     * */
    void found();

    static void start(){

    }

    default public void end(){

    }



}
