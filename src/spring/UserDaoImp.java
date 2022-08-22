package spring;

/**
 * @author 高志浩
 * @version 1.0
 */
public class UserDaoImp implements UserDao{

    @Override
    public void add() {
        System.out.println("调用Dao层数据");
    }
}
