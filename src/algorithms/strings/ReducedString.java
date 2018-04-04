package algorithms.strings;

import java.util.Scanner;

public class ReducedString {

    static String super_reduced_string(String s){
        // Complete this function
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 1; i < stringBuilder.length(); i++){
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i-1)){
                stringBuilder.delete(i-1, i+1);
                i = 0;
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        if (result.isEmpty())
            result = "Empty String";
        System.out.println(result);
    }

}
