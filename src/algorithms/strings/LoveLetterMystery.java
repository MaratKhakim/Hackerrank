package algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoveLetterMystery {

    static int theLoveLetterMystery(String s){
        // Complete this function
        int counter = 0;

        for (int i = 0; i < s.length()/2; i++){
            counter += Math.abs(s.charAt(s.length()-i-1) - s.charAt(i));
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            list.add(result);
        }

        for (int a : list)
            System.out.println(a);
    }
}
