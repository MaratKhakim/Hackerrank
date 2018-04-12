package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort1 {

    static void insertionSort1(int n, int[] arr) {
        // Complete this function
        for (int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i;

            while (j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                --j;
                printArray(arr);
            }

            arr[j] = temp;
        }
    }

    static void printArray(int[] array){
        for (int a : array)
            System.out.print(a+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        printArray(arr);
        in.close();
    }
}
