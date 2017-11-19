package current;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String[] operations = new String[]{"+", "-", "/", "*"};
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        String[] calcArgs = line.split(" ");


        Arrays.binarySearch(operations,calcArgs[1]);


    }
}
