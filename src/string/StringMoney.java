package string;
/**
 * @author 高志浩
 * @version 1.0
 */
public class StringMoney {

    /**
    * 金额数字值
    * */
    public static void main(String[] args) {
        int a=3;
        String str = "1244443453.97";
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int j=stringBuilder.lastIndexOf(".")-a;j>0;j-=a){
            stringBuilder.insert(j,",");
        }
        System.out.println(stringBuilder);
    }


    public void full(){

    }
}
