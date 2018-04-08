package algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoStrings {
    static String twoStrings(String s1, String s2){
        // Complete this function
        String abc = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++){
            if (s1.contains(String.valueOf(abc.charAt(i))) && s2.contains(String.valueOf(abc.charAt(i))))
                return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        List<String> list = new ArrayList<>();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            list.add(result);
        }

        for (String string : list)
            System.out.println(string);
    }
}
