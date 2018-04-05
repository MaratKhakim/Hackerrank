package algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankInString {
    static String hackerrankInString(String s) {
        // Complete this function
        String hackerrank = "hackerrank";
        if (s.length() < hackerrank.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < hackerrank.length() && s.charAt(i) == hackerrank.charAt(j)) {
                j++;
            }
        }
        return (j == 10 ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        List<String> list = new ArrayList<>();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            list.add(result);
        }

        for (String string : list)
            System.out.println(string);
        in.close();
    }
}
