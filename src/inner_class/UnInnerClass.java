package inner_class;

/**
 * @author gxh
 */
public class UnInnerClass {

    public static void main(String[] args) {
        new CellPhone().alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了！！！");
            }
        });

        new CellPhone().alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了！！！");
            }
        });
    }

    interface Bell{
        void ring();
    }
    static class CellPhone{
        public void alarmclock(Bell bell){
            bell.ring();//动态绑定 运行内存是new Bell
        }

    }
}
