package algorithms.implementation;

import java.util.Scanner;

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] numbers = new int[99];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            numbers[a[a_i]-1]++;
        }


        int max = 0;
        for (int i = 0; i < 98; i++){
            int sum = numbers[i] + numbers[i + 1];
            if (max < sum)
                max = sum;
        }

        System.out.println(max);
    }
}
