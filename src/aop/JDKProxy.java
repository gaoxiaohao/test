package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author 高志浩
 * @version 1.0
 */
public class JDKProxy {

    public static void main(String[] args) {
        Class[] interfaces = {LoginDao.class};
        LoginDao loginDao = new LoginServiceImp();
        //三个参数，第一个获取当前类的加载器，第二个获取要动态代理的接口，第三个实现InvocationHandler接口
        LoginDao o = (LoginDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new Handier(loginDao));
        o.add();
    }

}

class Handier implements InvocationHandler{

    private final Object object;
    public Handier(Object object) {
        this.object=object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //
        System.out.println("我是前置增强方法");
        Object invoke = method.invoke(object,args);
        System.out.println("我是前后置增强方法");
        return invoke;
    }
}
