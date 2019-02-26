package sort;


public class SortManager {


    private static int[] swap(int[] arr, int key1, int key2) {
        int temp = arr[key1];
        arr[key1] = arr[key2];
        arr[key2] = temp;
        return arr;
    }


    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    arr = swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }


    public static int[] selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (arr[min] != arr[i]) {
                arr = swap(arr, min, i);
            }
        }
        return arr;
    }


    public static int[] doubleSelectionSort(int[] arr) {
        int min;
        int max;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            min = i;
            max = i;
            for (int j = 1 + i; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            length--;
            if (arr[min] != arr[i]) {
                arr = swap(arr, min, i);
            }
            if (arr[max] != arr[length]) {
                arr = swap(arr, max, length);
            }

        }

        return arr;
    }


    public static int[] insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }


    public static int[] shellSort(int[] arr) {
        int midle = arr.length / 2;
        while (midle >= 1) {
            for (int right = 0; right < arr.length; right++) {
                for (int c = right - midle; c >= 0; c -= midle) {
                    if (arr[c] > arr[c + midle]) {
                        arr = swap(arr, c, c + midle);

                    }
                }
            }
            midle = midle / 2;
        }
        return arr;
    }


}

