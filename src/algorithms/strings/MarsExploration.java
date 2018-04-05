package algorithms.strings;

import java.util.Scanner;

public class MarsExploration {
    static int marsExploration(String s) {
        // Complete this function
        int counter = 0;
        char[] array = {'S', 'O', 'S'};
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != array[i%3])
                counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
