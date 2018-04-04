package algorithms.implementation;

import java.util.*;

public class BeautifulTriplets {

    static int beautifulTriplets(int d, Integer[] arr) {
        // Complete this function
        int counter = 0;
        List<Integer> list = Arrays.asList(arr);
        for (int i = 0 ; i < arr.length; i++){
            if (list.contains(arr[i] + d) && list.contains(arr[i] + 2*d))
                counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        Integer[] arr = new Integer[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
        in.close();
    }
}
