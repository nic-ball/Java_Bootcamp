package Day1;

import java.util.Scanner;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class BasicInputOutput {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a string: ");

        String result = input.nextLine();
        //retrieve the string value

        System.out.println(result);

    }



}
