package Day1;

/**
 * Created by nicholas.ball on 10/10/2016.
 */
public class Example {

    public static void main(String[] args) {
        int a = 10;

        a = 15;
        System.out.println("a = " + a);

        TestTwo t = new TestTwo();
        TestTwo f = t;

        a = test(a);
        System.out.println("a = " + a);
        System.out.println(t); //shows the memory location of t
    }

    static int test(int i) {    //from the int to the closing parenthesis is a method signature
        i = 20;
        return i;
    }

}

class TestTwo {

}
