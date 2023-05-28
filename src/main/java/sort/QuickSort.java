package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quicksort(int[] a,int l, int r) {
        if (l<r){
            int p = partition(a, l ,r);
            quicksort(a, l, p-1);
            quicksort(a, p+1, r);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int pointer = low;
        for (int i = low; i < high; i++) {
            if (array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[pointer];
                array[pointer] = temp;
                pointer++;
            }
            System.out.println(Arrays.toString(array));
        }
        int temp = array[pointer];
        array[pointer] = array[high];
        array[high] = temp;
        return pointer;
    }
}
