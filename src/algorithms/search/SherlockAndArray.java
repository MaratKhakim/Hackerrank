package algorithms.search;

import java.util.Scanner;

public class SherlockAndArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String[] results = new String[T];

        for(int a0 = 0; a0 < T; a0++) {
            int sum1 = 0, sum2 = 0;
            boolean isEqual = false;
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum1 += a[i];
            }

            if (a.length == 1)
                isEqual = true;
            else {
                for (int j = 1; j < n; j++){
                    sum2 += a[j-1];
                    sum1 -= a[j-1];

                    if ((sum1-a[j]) == sum2){
                        isEqual = true;
                        break;
                    }
                }
            }

            results[a0] = isEqual ? "YES" : "NO";
        }

        for (String s : results)
            System.out.println(s);

    }
}
