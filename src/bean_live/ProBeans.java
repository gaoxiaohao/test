package bean_live;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 初始化的前置后置处理器会为所有xml配置文件中存在的bean设置处理器
 * @author 高志浩
 * @version 1.0
 */
public class ProBeans implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("插入在初始化之前的before前置函数");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("插入在初始化之后的after后置函数");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
