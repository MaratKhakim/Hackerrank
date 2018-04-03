package algorithms.warmup;


import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        if (text.endsWith("PM") && !text.startsWith("12")){
            String substring = text.substring(0, 2);
            int a = 12+Integer.parseInt(substring);
            text = a + text.substring(2, text.length()-2);
        } else  if (text.endsWith("AM") && text.startsWith("12")) {

            text = "00" + text.substring(2, text.length() - 2);
        }
        else {
            text = text.substring(0, text.length()-2);
        }

        System.out.println(text);
    }
}
