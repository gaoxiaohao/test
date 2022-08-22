package bean_live;

/**
 * @author 高志浩
 * @version 1.0
 */
public class MyBeans {

    private String name;

    public MyBeans() {
        System.out.println("第一步，调用构造函数");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步，调用set方法");
    }

    public void initMyBeans(){
        System.out.println("第三步，调用初始化方法");
    }

    public void deleteBean(){
        System.out.println("第五步，销毁对象");
    }
}
