package bean_live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 高志浩
 * @version 1.0
 */
public class BeanLiveTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/application3.xml");
        MyBeans bean = classPathXmlApplicationContext.getBean("myBeans", MyBeans.class);
        System.out.println("第四步，获取对象");
        classPathXmlApplicationContext.close();
    }
}
