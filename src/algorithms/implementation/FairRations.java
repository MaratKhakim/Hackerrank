package algorithms.implementation;

import java.util.Scanner;

public class FairRations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] B = new int[N];
        int sum = 0;
        int counter = 0;

        for(int B_i = 0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            sum += B[B_i];
        }

        if (sum%2 == 1)
            System.out.println("NO");
        else {
            for (int i = 0; i < N - 1; i++){
                if (B[i]%2 != 0){
                    B[i] = B[i] + 1;
                    B[i+1] = B[i+1] + 1;
                    counter += 2;
                }
            }

            System.out.println(counter);
        }

        in.close();
    }
}
