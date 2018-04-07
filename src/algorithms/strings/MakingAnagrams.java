package algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class MakingAnagrams {
    static int makingAnagrams(String s1, String s2){
        // Complete this function
        int counter = 0;
        int[] array = new int[26];

        for (int i = 0; i < s1.length(); i++){
            array[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++){
            array[s2.charAt(i) - 'a']--;
        }

        for (int j = 0; j < 26; j++){
            counter += Math.abs(array[j]);
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
