package list_spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 高志浩
 * @version 1.0
 */
public class MyBean implements FactoryBean<Books> {
    @Override
    public Books getObject() throws Exception {
        return new Books();
    }

    @Override
    public Class<?> getObjectType() {
        return Books.class;
    }
}
