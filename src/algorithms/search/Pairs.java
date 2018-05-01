package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    static int pairs(int k, int[] arr) {
        // Complete this function
        int counter = 0;

        Arrays.sort(arr);
        int i = 0, j = 1;

        while (j < arr.length){
            int diff = arr[j] - arr[i];

            if (diff == k){
                counter++;
                j++;
            } else if (diff > k)
                i++;
            else if (diff < k)
                j++;
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }
}
