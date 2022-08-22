package other;

import javax.swing.text.html.Option;
import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author gxh
 */
public class Test {
    public static void main(String[] args) {

        int a = 10;
        int i = a--;
        //temp=10 a=a+1 a=temp
        System.out.println(i);
        System.out.println(a);

        int d = 59 / 7;
        int c = 59 % 7;
        System.out.println("假如还有59天放假，合" + d + "个星期零" + c + "天");

        int[] b= {1,2,11,44,0,656,8};
        double w = 234.5;
        double r = 5.0 / 9 * (w - 100.0);
        System.out.println(r);
        Arrays.sort(b);
    }

}
