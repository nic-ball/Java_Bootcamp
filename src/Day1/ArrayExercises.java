package Day1;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class ArrayExercises {

    public static void main(String[] args) {
        computeTwoDArrays();

    }

    static void computeTwoDArrays() {
        int twoD[][] = new int[10][5];

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = j* 2;
            }
        }
        for (int i = 0; i < 10; i++) {

            for(int j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
