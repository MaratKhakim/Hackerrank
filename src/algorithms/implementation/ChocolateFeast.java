package algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast {

    static int chocolateFeast(int n, int c, int m) {
        // Complete this function
        int a = 0;
        int counter = 0;

        while (n >= c){
            n -= c;
            counter++;
            a++;

            if (a == m){
                counter++;
                a = 1;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] array = new int[t];

        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            array[a0] = result;
        }

        for (int s : array)
            System.out.println(s);
        in.close();
    }
}
