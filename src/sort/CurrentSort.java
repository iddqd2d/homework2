package sort;

import java.util.Arrays;
import java.util.Random;

public class CurrentSort {
    public static void main(String[] args) {
        int[] arr = SortManager.shellSort(new CurrentSort().createArr(10000));
        System.out.println(Arrays.toString(arr));
    }


    private int[] createArr(int n) {
        int[] arr = new int[n];
        while (--n >= 0) {
            arr[n] = new Random().nextInt(99);
        }
        return arr;
    }


}
