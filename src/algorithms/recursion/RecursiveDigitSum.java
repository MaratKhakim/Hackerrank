package algorithms.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveDigitSum {
    static int digitSum(String n, int k) {
        // Complete this function
        BigInteger N = new BigInteger(n);
        int result = (k * N.remainder(new BigInteger("9")).intValue()) % 9;
        return result == 0 ? 9 : result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int k = in.nextInt();
        int result = digitSum(n, k);
        System.out.println(result);
        in.close();
    }
}
