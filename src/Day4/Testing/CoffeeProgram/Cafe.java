package Day4.Testing.CoffeeProgram;

/**
 * Created by nicholas.ball on 13/10/2016.
 */
public class Cafe {
    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType) {
        return brew(coffeeType, 1);
    }

    public Coffee brew(CoffeeType coffeeType, int quantity) {
        requiredQuantity(quantity);

        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;
        if(requiredBeans > beansInStock || requiredMilk > milkInStock) {
            throw new IllegalStateException("Insufficient beans or milk ");
        }


        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;

        return new Coffee(coffeeType, requiredBeans, requiredMilk);
    }

    public void restockBeans(int numberOfBeans) {
        beansInStock += numberOfBeans;
    }
    public void restockMilk(int milkInGrams) {
        milkInGrams += milkInGrams;
    }



    private void requiredQuantity(int value) {
        if(value < 1) {
            throw new IllegalArgumentException();
        }
    }
}
