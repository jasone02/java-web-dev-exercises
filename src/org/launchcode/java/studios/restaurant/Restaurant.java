package org.launchcode.java.studios.restaurant;

public class Restaurant {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMenuItem(new MenuItem("Generic Chinese Food", 3.99, "very generic", "chinese"));
        menu.addMenuItem(new MenuItem("Generic Taco(s)", 4.99, "what did you expect", "mexican"));
        menu.addMenuItem(new MenuItem("Generic Pasta Dish", 5.99, "no comment", "italian"));

        menu.print();

        menu.getMenu().get(0).print();

        menu.removeMenuItem(menu.getMenu().get(1).getName());
        menu.print();
    }
}
