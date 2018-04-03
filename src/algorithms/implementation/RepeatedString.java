package algorithms.implementation;

import java.util.Scanner;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        // Complete this function
        char[] sArray = s.toCharArray();
        int counter = 0;
        long result = 0;

        for (int i = 0; i < sArray.length; i++){
            if (sArray[i] == 'a')
                counter++;
        }

        result = n/sArray.length * counter;

        for (int k = 0; k < n%sArray.length; k++){
            if (sArray[k] == 'a')
                result++;
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
