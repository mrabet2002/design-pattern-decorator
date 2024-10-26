package decorators;

import products.Drink;

public class Hazelnut extends DrinkDecorator {

    public Hazelnut(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return drink.cost() + 3.0;
    }

    @Override
    public String getName() {
        return drink.getName() + ", Hazelnut";
    }
}
