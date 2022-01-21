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

    public void addMenuItem(MenuItem item) {
        menu.add(item);
        lastUpdated = new Date();
    }
    public void removeMenuItem(String name) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getName() == name) {
                menu.remove(i);
            }
        }
        lastUpdated = new Date();
    }

    public void print() {
        for (int i = 0; i < menu.size(); i++) {
            menu.get(i).print();
        }
    }
}
