package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author 高志浩
 * @version 1.0
 */
public class SpringFactory {

    public static Pad getPads() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application.xml");
        Pad name = applicationContext.getBean("name", Pad.class);
        name.play();
        Class<?> aClass = Class.forName("spring.Pad");
        return (Pad) aClass.getDeclaredConstructor().newInstance();


    }

}
