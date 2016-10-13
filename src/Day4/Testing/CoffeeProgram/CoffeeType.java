package Day4.Testing.CoffeeProgram;

/**
 * Created by nicholas.ball on 13/10/2016.
 */
public enum CoffeeType {
    ESPRESSO(10, 0),
    LATTE(5, 220),
    FILTER(10, 0);

    private final int requiredBeans;
    private final int requiredMilk;

    CoffeeType(int requiredBeans, int requiredMilk) {
        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }
}
