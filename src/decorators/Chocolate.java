package decorators;

import products.Drink;

public class Chocolate extends DrinkDecorator {

    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return drink.cost() + 2.0;
    }

    @Override
    public String getName() {
        return drink.getName() + ", Chocolate";
    }
}
