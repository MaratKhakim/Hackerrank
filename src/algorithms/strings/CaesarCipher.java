package algorithms.strings;

import java.util.Scanner;

public class CaesarCipher {
    static String caesarCipher(String s, int k) {
        // Complete this function
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++){
            if (array[i] >= 'a' && array[i] <= 'z'){
                array[i] = (char) ('a' + (array[i] - 'a' + k) % 26);
            } else if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] = (char) ('A' + (array[i] - 'A' + k) % 26);
            }
        }

        return new String(array);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
