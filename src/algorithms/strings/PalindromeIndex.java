package algorithms.strings;

import java.util.Scanner;

public class PalindromeIndex {
    static int palindromeIndex(String s){
        // Complete this function
        for (int i = 0, j = s.length() - 1; i < j; i++, j--){
            if (s.charAt(i) != s.charAt(j)){
                if (isPalindrome(s, i))
                    return i;
                else if (isPalindrome(s, j))
                    return j;
            }
        }

        return -1;
    }

    static boolean isPalindrome(String s, int index){
        for (int i = index+1, j = s.length()-1-index; i < j; i++, j--){
            if (s.charAt(i) != s.charAt(j))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] array = new int[q];
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            array[a0] = result;
        }

        for (int a : array)
            System.out.println(a);
    }
}
