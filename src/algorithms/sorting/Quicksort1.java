package algorithms.sorting;

import java.util.Scanner;

public class Quicksort1 {
    static int[] quickSort(int[] arr) {
        // Complete this function
        int pivot = arr[0];

        int i = 1, j = arr.length-1;

        while (i <= j){
            while (arr[i] < pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i <= j){
                exch(arr, i, j);
                i++;
                j--;
            }
        }

        exch(arr, 0, j);

        return arr;
    }

    static void exch(int[] a, int m, int n){
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
