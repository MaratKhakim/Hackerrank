package algorithms.bitmanipulation;

import java.util.Scanner;

public class SumVsXOR {

    static long solve(long n) {
        // Complete this function
        long counter = 0;

        while (n > 0){
            if (n%2 == 0)
                counter++;
            n = n >> 1;
        }

        return (long) Math.pow(2, counter);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}
