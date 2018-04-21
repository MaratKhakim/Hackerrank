package algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckBalance {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int result = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int t = in.nextInt();

            result += l;

            if (t == 1)
                list.add(l);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size()-k; i++){
            result -= 2*list.get(i);
        }

        System.out.println(result);
        in.close();
    }
}
