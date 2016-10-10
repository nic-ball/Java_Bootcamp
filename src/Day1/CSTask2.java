package Day1;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class CSTask2 {

    static Scanner input2 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a Character: ");
        char result2 = input2.next().charAt(0);

        if(Character.isDigit(result2))
        System.out.println("You entered a digit!");

        else if(Character.isUpperCase(result2))
            System.out.println("Your Character is Upper Case");

        else if(Character.isLowerCase(result2))
            System.out.println("Your character is Lower Case");
        else
            System.out.println("You did not enter a matching Character!");
    }

}
