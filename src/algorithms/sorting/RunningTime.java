package algorithms.sorting;

import java.util.Scanner;

public class RunningTime {
    static int runningTime(int[] arr) {
        // Complete this function
        int counter = 0;

        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i;

            while (j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
                counter++;
            }

            arr[j] = temp;
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = runningTime(arr);
        System.out.println(result);
        in.close();
    }
}
