package oop;

/**
 * @author gxh
 */
public class Account {

    private String name;
    private Integer salary;
    private String password;


    public String getName() {
        return name;
    }
    public void showInfo(){
        String name = getName();
        System.out.println("用户名是"+name);
    }


    public void setName(String name) {
        if (name.length()>=2 && name.length()<=4){
            System.out.println("用户名称长度不正确");
        }else {
            this.name = name;
        }

    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
