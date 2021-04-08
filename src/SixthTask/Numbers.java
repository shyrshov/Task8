package SixthTask;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int[] array = new int[a.length()];
        try {
            for (int i = 0; i < a.length(); i++) {
                array[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
                System.out.println(array[i]);
            }
        } catch (NumberFormatException e) {
        }
    }

    public static void main(String[] args) {
        readData();
    }
}
