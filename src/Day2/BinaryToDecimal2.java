package Day2;

import java.util.Scanner;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class BinaryToDecimal2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //get user input
        System.out.println("Enter a binary number: ");
        String input = scanner.nextLine();

        //BinaryConversion(input);

        System.out.println("Binary is: " + BinaryConversion(input));
    }

    static int BinaryConversion(String binary) {

        int mult = 1;
        int result = 0;
        for(int i = binary.length()-1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result = result + mult;
            }
            mult = mult * 2;
        }
        return result;
    }
}
