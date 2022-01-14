package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    private Date lastUpdated = new Date();

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
        lastUpdated = new Date();
    }
    public ArrayList<MenuItem> getMenu() {
        return menu;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
}
