package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort2 {
    static void insertionSort2(int n, int[] arr) {
        // Complete this function
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i;

            while (j > 0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                --j;
            }

            arr[j] = temp;
            printArray(arr);
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
        insertionSort2(n, arr);
        in.close();
    }
}
