package Day4.Testing;

import Day4.Testing.CoffeeProgram.Cafe;
import Day4.Testing.CoffeeProgram.Coffee;
import Day4.Testing.CoffeeProgram.CoffeeType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by nicholas.ball on 13/10/2016.
 */
public class CafeTest {

    public static final int ESPRESSO_BEANS = CoffeeType.ESPRESSO.getRequiredBeans();
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;

    private Cafe cafe;

    @Before
    public void before() {

        cafe = new Cafe();
    }


    public void withBeans() {
        cafe.restockBeans(ESPRESSO_BEANS);
    }

    public void mustRestockBeans() {
        cafe.restockBeans(NO_BEANS);
    }



    @Test
    public void canBrewEspresso() {
        //GIVEN
        withBeans();

        //WHEN
        Coffee coffee = cafe.brew(CoffeeType.ESPRESSO);

        //THEN
        Assert.assertEquals("Wrong type of coffee", CoffeeType.ESPRESSO, coffee.getType());
    }
}
