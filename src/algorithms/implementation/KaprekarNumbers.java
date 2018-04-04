package algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaprekarNumbers {

    static int[] kaprekarNumbers(int p, int q) {
        // Complete this function
        List<Integer> list = new ArrayList<>();
        long iSqr = 0;
        int lengthI = 1;
        long r, l;
        for (int i = p; i <= q; i++){
            iSqr = (long) i * i;
            lengthI = String.valueOf(i).length();
            r = (long) (iSqr % Math.pow(10, lengthI ));
            l = (long) (iSqr / Math.pow(10, lengthI ));
            if (l + r == i)
                list.add(i);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        int[] result = kaprekarNumbers(p, q);
        if (result.length == 0)
            System.out.println("INVALID RANGE");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
