package org.launchcode.java.studios.restaurant;

import org.launchcode.java.demos.lsn3classes1.Student;
import org.launchcode.java.demos.lsn3classes1.Teacher;

import java.util.Date;

public class MenuItem {
    private String itemName;
    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private final Date dateAdded;


    public MenuItem(String itemName, String description, double price, String category, boolean isNew, Date dateAdded) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = dateAdded;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getDateAdded() {
        return dateAdded;
    }
}

