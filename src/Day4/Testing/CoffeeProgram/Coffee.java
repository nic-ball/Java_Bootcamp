package Day4.Testing.CoffeeProgram;

/**
 * Created by nicholas.ball on 13/10/2016.
 */
public class Coffee {
    private final CoffeeType type;
    private final int beans;
    private final int milk;

    public Coffee(CoffeeType coffeeType, int beans, int milk) {
        this.type = coffeeType;
        this.beans = beans;
        this.milk = milk;
    }

    public CoffeeType getType() { return type; }

    public int getBeans() { return beans; }

    public int getMilk() { return milk; }
}
