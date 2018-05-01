package algorithms.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
    static int[] missingNumbers(int[] arr, int[] brr) {
        // Complete this function
        List<Integer> list = new ArrayList<>();
        int[] array = new int[10000];

        for (int i = 0; i < brr.length; i++)
            array[brr[i]]++;

        for (int i = 0; i < arr.length; i++)
            array[arr[i]]--;

        for (int k = 0; k < array.length; k++){
            if (array[k] != 0)
                list.add(k);
        }

        int[] result = new int[list.size()];

        for (int j = 0; j < list.size(); j++)
            result[j] = list.get(j);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
