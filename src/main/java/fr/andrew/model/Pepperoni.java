package fr.andrew.model;

public class Pepperoni extends Pizza {

    @Override
    public void prepare() {
        System.out.println("blend of beef and pork seasoned with salt, paprika, chili flakes or cayenne pepper, fennel seed and garlic");
    }

    @Override
    public String toString() {
        return "Pepperoni{}";
    }
}
