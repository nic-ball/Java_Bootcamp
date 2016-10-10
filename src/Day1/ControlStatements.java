package Day1;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class ControlStatements {

    public static void main(String[] args) {

        //if
        int month = 10;
        String season;

        if(month == 12 || month == 1 || month == 2 )
            season = "Winter";
        else if(month == 3 || month == 4 || month == 5)
            season = "Spring;";
        else if(month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if(month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Bogus Month";

        System.out.println("October is in the " + season);
    }
}
