package other;

/**
 * @author gxh
 */
public class Kong {

    /**
     * 步骤拆解：
     * 1.先打印一个矩形  双重for循环打印
     * 2.再打印一半的矩形  内层for循环打印i-1
     * 3.打印金字塔    找到规律  个数=层数*2-1  金字塔其他地方添加空格   空格=5-层数
     * 4.空心金字塔    找到规律  首个和最后一个为*，最后一行为*  其他为空格
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Kong2.kong(i,5);
            System.out.println();
        }

    }
}
