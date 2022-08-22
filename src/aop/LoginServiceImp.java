package aop;

/**
 * @author 高志浩
 * @version 1.0
 */
public class LoginServiceImp implements LoginDao{
    @Override
    public void add() {
        System.out.println("我是原方法");
    }
}
