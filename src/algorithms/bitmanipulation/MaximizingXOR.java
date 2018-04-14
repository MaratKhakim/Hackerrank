package algorithms.bitmanipulation;

import java.util.Scanner;

public class MaximizingXOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int max = 0;

        for (int i = l; i <= r; i++){
            for (int j = i; j <= r; j++){
                int bit = i^j;
                if (max < bit)
                    max = bit;
            }
        }

        System.out.println(max);
    }
}
