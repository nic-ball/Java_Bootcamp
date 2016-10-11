package Day2;

        import java.util.Scanner;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class BinaryToDecimal {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a Binary number: ");
        String binaryString = input.nextLine();
        System.out.println("The binary number: " + binaryString + " is " + Integer.parseInt(binaryString, 2) + " in decimal");

    }



}