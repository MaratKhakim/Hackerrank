package algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiggerIsGreater {

    static String biggerIsGreater(String w) {
        // Complete this function
        char[] array = w.toCharArray();

        int i = array.length - 1;

        while (i > 0 && array[i-1] >= array[i])
            i--;

        if (i <= 0)
            return "no answer";

        int j = array.length - 1;

        while (array[j] <= array[i-1])
            j--;

        char temp = array[i-1];
        array[i-1] = array[j];
        array[j] = temp;

        j = array.length - 1;

        while (i < j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return new String(array);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        List<String> list = new ArrayList<>();
        for(int a0 = 0; a0 < T; a0++){
            String w = in.next();
            String result = biggerIsGreater(w);
            list.add(result);
        }

        for (String string : list)
            System.out.println(string);
        in.close();
    }

}
