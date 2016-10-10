package Day1;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class FirstLastSix {


    public static void main(String[] args) {
        int [] a = {1, 3, 3, 6};
        int [] b = {6, 3, 1};
        int [] c = {1, 6, 3};

        System.out.println(isFirstLastSix(a));
        System.out.println(isFirstLastSix(b));
        System.out.println(isFirstLastSix(c));

    }
    static boolean isFirstLastSix(int[] value) {
        return (value[0] == 6 || value[value.length - 1] == 6);

    }
}
