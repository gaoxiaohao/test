package abstracts;

/**
 * @author gxh
 */
public class Manager extends Employee {

    private Integer bonus;

    public Manager(String name, Integer id, Integer salary, Integer bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("用户编号:"+getId()+"\t员工工资:"+getSalary()+"\t员工姓名:"+getName()+"\t员工等级:"+bonus);
    }
}
