package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(double price, String description, String category, Date dateAdded) {
        this.price = price;
        this.category = category;
        this.description = description;
        this.dateAdded = dateAdded;
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

    public boolean isNew() {
        Date currDate = new Date();
        //check if the dates are (3) days apart
        int newTimeMillis = 259200000;
        return currDate.toInstant().plusMillis(-newTimeMillis).isBefore(dateAdded.toInstant());
    }
}
