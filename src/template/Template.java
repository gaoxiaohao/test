package template;

/**
 * @author gxh
 */
public abstract class Template {

    public abstract void job();

    public void time(){
        long start = System.currentTimeMillis();
        //创建对象时，多态的动态绑定，调用time方法，去找子类实现的job
        job();
        long end = System.currentTimeMillis();
        System.out.println("运行时间间隔："+(end-start));
    }

}
