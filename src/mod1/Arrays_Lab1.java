package mod1;

import java.util.ArrayList;
import java.util.Arrays;


public class Arrays_Lab1 {
    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40};
        System.out.println(getMin(myNum));
        System.out.println(getAve(myNum));
        System.out.println(getMax(myNum));

        }


    public static int getMin(int[] n) {
        int result = 0;
        for (int i = 0; i<n.length; i++) {
            if (i==0) {
                result = n[i];
            }else if (n[i]<result){
                result=n[i];
            }
        }
        return result;
    }

    public static int getMax(int[] n) {
        int result = 0;
        for (int i = 0; i<n.length; i++) {
            if (i==0) {
                result = n[i];
            }else if (n[i]>result){
                result=n[i];
            }
        }
        return result;
    }

    public static int getAve(int[] n) {
        int result = 0;
        for (int i = 0; i<n.length; i++) {
            result = n[i]+result;
        }
        return result/n.length;
    }
}
