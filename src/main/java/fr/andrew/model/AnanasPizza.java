package fr.andrew.model;

public class AnanasPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("pineapple, tomato sauce, mozzarella cheese, and either ham or bacon");
    }

    @Override
    public String toString() {
        return "AnanasPizza{}";
    }
}
