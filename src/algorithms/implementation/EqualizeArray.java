package algorithms.implementation;

import java.util.Scanner;

public class EqualizeArray {

    static int equalizeArray(int[] arr) {
        // Complete this function
        int result = 0;

        int[] array = new int[101];

        for (int i = 0; i < arr.length; i++){
            array[arr[i]]++;
        }

        for (int k = 0; k < 101; k++){
            if (array[k] > result)
                result = array[k];
        }

        return arr.length - result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }

}
