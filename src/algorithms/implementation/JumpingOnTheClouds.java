package algorithms.implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        // Complete this function
        int counter = 0;

        for (int i = 0; i < c.length - 1; i++) {
            if ( c[i] != 1) {
                if ( i!= c.length-2 && c[i + 2] != 1) {
                    i++;
                }

                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
