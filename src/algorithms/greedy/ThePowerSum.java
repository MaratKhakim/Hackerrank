package algorithms.greedy;

import java.util.Scanner;

public class ThePowerSum {
    static int powerSum(int X, int N) {
        // Complete this function
        return recur(X, N, 1);
    }

    static int recur(int x, int n, int a){
        int powA = (int) Math.pow(a, n);

        if (powA > x)
            return 0;
        else if (powA == x)
            return 1;
        else
            return recur(x, n, a+1) + recur(x-powA, n, a+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N);
        System.out.println(result);
        in.close();
    }
}
