package algorithms.strings;

import java.util.Scanner;

public class GameOfThrones1 {

    static String gameOfThrones(String s){
        // Complete this function
        int[] array = new int[26];
        int counter = 0;

        for (int i = 0; i < s.length(); i++){
            array[s.charAt(i)-'a']++;
        }

        for (int j = 0; j < 26; j++){
            if (array[j]%2 == 1)
                counter++;

            if (counter > 1)
                return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
