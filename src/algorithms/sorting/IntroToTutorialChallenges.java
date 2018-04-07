package algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

    static int introTutorial(int V, int[] arr) {
        // Complete this function
        int low = 0;
        int high = arr.length;


        while (low <= high){
            int mid = (low + high)/2;
            int item = arr[mid];

            if (item == V)
                return mid;

            if (item < V)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = introTutorial(V, arr);
        System.out.println(result);
        in.close();
    }
}
