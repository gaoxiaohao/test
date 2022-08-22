package other;

import java.util.Arrays;

/**
 * @author gxh
 */
public class MyTools {


    public static void bubble(){
        int[] arr={34,74,11,98,56};
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        bubble();
    }

}
