package exceptions;

/**
 * @author 高志浩
 * @version 1.0
 */
public class Exceptions {

    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("请输入两个参数");
            }
            int num1= Integer.parseInt(args[0]);
            int num2= Integer.parseInt(args[1]);
            int add = add(num1, num2);
            System.out.println(add);
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
    public static int add(int a,int b){
        return a/b;
    }
}
