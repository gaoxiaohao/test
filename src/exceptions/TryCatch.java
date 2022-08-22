package exceptions;

import java.util.Scanner;

/**
 * @author 高志浩
 * @version 1.0
 */
public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true){
            System.out.println("请输入一个整数");
            String next = scanner.next();
            try {
                num = Integer.parseInt(next);
                break;
            }catch (Exception e){
                System.out.println("这不是一个整数");
            }
        }
        System.out.println("输入的整数是"+num);

    }
}
