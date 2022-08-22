package other;

/**
 * @author gxh
 */
public class Day1 {

    public static void main(String[] args) {
        // \t  一个制表位，实现对齐功能
        System.out.println("北京\t上海\t广州\t深圳\t");
        // \n  换行符
        System.out.println("北京\n上海\n广州\n深圳\n");
        // \\  一个\
        System.out.println("\\");
        // \"  一个"
        System.out.println("\"");
        System.out.println("'apple is great'");
        // \r  回车符+换行
        System.out.println("你好，黄艳梅\r\n!你在哪里");


        //byte short int long float double 基本数据类型自动转换
        //char int long float double  基本数据类型自动转换
        int a = 'a';
        double b = 'c';
        byte c = (byte) 1200.00;
        System.out.println(c);

        String sb = "45";
        String close = "close";
        try {
            int number = Integer.parseInt(close);
            System.out.println(number);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        float caster = Float.parseFloat(sb);
        char open = sb.charAt(0);
        System.out.println(caster);


        char e = '\n';
        char f = '\n';
        char g = '\n';
        char h = '\\';
        System.out.println(e);

    }

}
