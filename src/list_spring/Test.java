package list_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 高志浩
 * @version 1.0
 */
public class Test {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application3.xml");
        Books student = applicationContext.getBean("myBean",Books.class);
        System.out.println(student);
    }
}
