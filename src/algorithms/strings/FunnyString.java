package algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunnyString {

    static String funnyString(String s){
        // Complete this function
        StringBuilder stringBuilder = new StringBuilder(s);
        String reverseS = stringBuilder.reverse().toString();
        boolean isFunny = false;

        for (int i = 1; i < s.length(); i++){
            isFunny = Math.abs(s.charAt(i) - s.charAt(i-1)) == Math.abs(reverseS.charAt(i) - reverseS.charAt(i-1));
            if (!isFunny)
                return "Not Funny";
        }

        return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        List<String> list = new ArrayList<>();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            list.add(result);
        }

        for (String string : list)
            System.out.println(string);
    }
}
