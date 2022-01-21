package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.Scanner;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;
    private static final int NEW_ITEM_DURATION_IN_DAYS = 7;

    public MenuItem(String name, double price, String description, String category, Date dateAdded) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        dateAdded = new Date();
    }

    public double getPrice() {
        return price;
    }


    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public Date getDateAdded() { return dateAdded; }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        long now = new Date().getTime();
        long newItemDurationInMs = NEW_ITEM_DURATION_IN_DAYS *24*60*1000;

        return now - dateAdded.getTime() < newItemDurationInMs;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Date Added: " + dateAdded);
    }

    public boolean equals(MenuItem otherItem) {
        return this.getName() == otherItem.getName() &&
                this.getPrice() == otherItem.getPrice() &&
                this.getCategory() == otherItem.getCategory() &&
                this.getDescription() == otherItem.getDescription() &&
                this.getDateAdded().getTime() == otherItem.getDateAdded().getTime();
    }
}
