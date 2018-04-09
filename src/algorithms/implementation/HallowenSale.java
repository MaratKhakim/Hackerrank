package algorithms.implementation;

import java.util.Scanner;

public class HallowenSale {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = 0;
        int sum = p;

        while (sum <= s){
            p -= d;
            if (p < m)
                p = m;
            sum += p;
            answer++;
        }

        System.out.println(answer);
        in.close();
    }
}
