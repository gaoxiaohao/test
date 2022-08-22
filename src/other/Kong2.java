package other;

/**
 * @author gxh
 */
public class Kong2 {

    public static void main(String[] args) {
        int total=5;
        for (int i = 1; i <= total; i++) {
            kong(i,total);
            System.out.println();
        }
    }

    public static void kong(int i,int total) {
        int o=2;
        for (int k = 1; k <= total - i; k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= o * i - 1; j++) {
            if (j == 1 || j == o * i - 1 || i == total) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
    }
}
