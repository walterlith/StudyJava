package demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OneArrayMemory {
    public static void main(String[] args){
        int num1 = 1024 * 1024 * 2;
        int[] arr1 = new int[num1];
        Arrays.fill(arr1, 1);
    }
}
