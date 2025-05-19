package fr.andrew.model;

public class PizzaFactory {
    public Pizza getInstance(String code){
        if(code.equals("A"))
            return new AnanasPizza();
        else if (code.equals("M"))
            return new Margherita();
        else
            return new Pepperoni();
    }
}
