package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(a)));
    }
    static public int[] mergesort(int[] arr){
        if (arr.length == 0 || arr.length == 1) return arr;

        int s = 0, e = arr.length >> 1;
        int[] arr1 = Arrays.copyOfRange(arr,s,e);
        int[] arr2 = Arrays.copyOfRange(arr,e,arr.length);

        return merge(mergesort(arr1), mergesort(arr2));
    }
    static public int[] merge(int[] a, int[] b){
        int pa = 0, pb = 0, i=0;
        int[] res = new int[a.length + b.length];
        while (pa < a.length && pb < b.length ){
            if (a[pa] <= b[pb]){
                res[i] = a[pa];
                pa++;
            }else {
                res[i] = b[pb];
                pb++;
            }
            i++;
        }
        if (pa < a.length){
            while (pa < a.length){
                res[i] = a[pa];
                pa++;
                i++;
            }
        }
        if (pb < b.length){
            while (pb < b.length){
                res[i] = b[pb];
                pb++;
                i++;
            }
        }

        return res;
    }
}
