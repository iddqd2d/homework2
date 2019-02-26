package sort;

import java.util.Arrays;
import java.util.Random;

public class CurrentSort {
    public static void main(String[] args) {

        int[] arr = SortManager.shellSort(new CurrentSort().createArray(100));
        System.out.println(Arrays.toString(arr));
    }


    private int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(99);
        }
        return arr;
    }


}
