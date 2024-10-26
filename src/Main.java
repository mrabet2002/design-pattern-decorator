import decorators.Chocolate;
import decorators.Hazelnut;
import products.Drink;
import products.Espresso;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Espresso();
        System.out.println(drink.getName() + ": " + drink.cost());

        drink = new Chocolate(drink);
        System.out.println(drink.getName() + ": " + drink.cost());

        drink = new Hazelnut(drink);
        System.out.println(drink.getName() + ": " + drink.cost());
    }
}