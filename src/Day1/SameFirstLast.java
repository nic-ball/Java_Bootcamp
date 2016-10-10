package Day1;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class SameFirstLast {

    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3, 1};
        int [] c = {1, 2, 1};

        System.out.println(isSameFirstLast(a));
        System.out.println(isSameFirstLast(b));
        System.out.println(isSameFirstLast(c));

    }
    static boolean isSameFirstLast(int[] value) {
        return (value[0] == value[value.length - 1]);

    }
}
