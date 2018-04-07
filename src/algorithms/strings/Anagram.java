package algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagram {

    static int anagram(String s){
        // Complete this function
        int length = s.length();
        int counter = 0;

        if (length%2 == 1)
            return -1;

        int[] array = new int[26];

        for (int i = 0; i < length/2; i++){
            array[s.charAt(i) - 'a']++;
        }

        for (int i = length/2; i < length; i++){
            array[s.charAt(i) - 'a']--;
        }

        for (int j = 0; j < 26; j++){
            counter += Math.abs(array[j]);
        }

        return counter/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            list.add(result);
        }

        for (int a : list)
            System.out.println(a);
    }
}
