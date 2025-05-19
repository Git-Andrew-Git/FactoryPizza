package fr.andrew.model;

public class Margherita extends Pizza {

    @Override
    public void prepare() {
        System.out.println("tomatoes, mozzarella and basil");
    }

    @Override
    public String toString() {
        return "Margherita{}";
    }
}
