package abstracts;

/**
 * @author gxh
 */
public class CommonEmployee extends Employee{


    public CommonEmployee(String name, Integer id, Integer salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("员工用户编号:"+getId()+"\t员工工资:"+getSalary()+"\t员工姓名:"+getName());
    }
}
