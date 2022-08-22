package abstracts;

/**
 * @author gxh
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("高志浩",12,10000,3);
        CommonEmployee commonEmployee = new CommonEmployee("黄艳梅",11,8000);
        manager.work();
        commonEmployee.work();

    }
}
