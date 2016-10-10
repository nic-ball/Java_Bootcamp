package Day1;

import java.util.Scanner;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class CSTask1 {

    static Scanner input1 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number between 0 - 2000: ");
        int result1 = input1.nextInt();
        {
        if(result1 <2000 || result1 < 0)
            System.out.println("Your number " + result1 + " is beyond our scope!");
        else if(result1 == 100)
            System.out.println("Your number is equal to 100!");
        else if(result1 < 500)
            System.out.println("Your number is less than 500!");
        else if(result1 == 500)
            System.out.println("Your number is equal to 500!");
        else if(result1 < 1000)
            System.out.println("Your number is less than 1000!");
        else if(result1 == 1000)
            System.out.println("Your number is equal to 1000!");
        else if(result1 > 1000 && result1 <2000)
            System.out.println("Your number is greater than 1000 but less than 2000!");
        else if(result1 < 100)
            System.out.println("Your number is less than 100!");
        else
            System.out.println("Computer says no!!!!!");

    }
}
}