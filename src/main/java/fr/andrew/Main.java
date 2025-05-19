package fr.andrew;

import fr.andrew.model.Pizza;
import fr.andrew.model.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.getInstance("M");
        pizza1.prepare();
        Pizza pizza2 = pizzaFactory.getInstance("A");
        pizza2.prepare();
        Pizza pizza3 = pizzaFactory.getInstance("5633");
        pizza3.prepare();
    }
}