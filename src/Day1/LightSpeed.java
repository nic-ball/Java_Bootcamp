package Day1;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class LightSpeed {

    /* Evanson et al calculated 299,792,458 m/s
    1 mile = 1609.34 metres
    approximate speed of light in seconds
    */
    static double lightSpeedInMiles = 186282.86;
    static int days = 25;
    static long seconds = days * 24 * 60 * 60;

    public static void main(String[] args) {

        System.out.println("The distance travelled in " + days + " days " + "is : " + lightCalculator());

    }

        //declare variables and data types
        static double lightCalculator() {

            return lightSpeedInMiles * seconds;
        }
}


    //method to compute light speed

