package algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        long result = 0;

        for (int i = n-1; i >= 0; i--){
            result += array[i] * Math.pow(2, n-1-i);
        }

        System.out.println(result);
    }
}
