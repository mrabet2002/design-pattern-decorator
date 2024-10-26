package decorators;

import products.Drink;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return drink.cost() + 0.5;
    }

    @Override
    public String getName() {
        return drink.getName() + ", Milk";
    }
}
