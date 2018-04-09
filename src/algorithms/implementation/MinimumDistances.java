package algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        int min = 100000;
        int value = 0;

        for (int i = 0; i < n; i++){
            value = scanner.nextInt();
            if (map.containsKey(value)){
                int oldIndex = map.get(value);
                if (min > i - oldIndex)
                    min = i - oldIndex;
            } else {
                map.put(value, i);
            }
        }

        System.out.println(min==100000 ? -1:min);
    }
}
