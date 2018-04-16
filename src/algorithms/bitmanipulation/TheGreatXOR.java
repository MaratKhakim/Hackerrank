package algorithms.bitmanipulation;

import java.util.Scanner;

public class TheGreatXOR {
    static long theGreatXor(long x){
        // Complete this function
        long counter = 0;
        long copy = x;
        while (copy > 0){
            copy = copy/2;
            counter++;
        }

        return (1L << counter) - x - 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            long result = theGreatXor(x);
            System.out.println(result);
        }
    }
}
