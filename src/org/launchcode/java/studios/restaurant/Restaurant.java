package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        Date today = Calendar.getInstance().getTime();
        MenuItem newItem1 = new MenuItem("Seafood Coconut Curry","Coconut flavored curry",12.99,"Entrees",false, today);
        MenuItem newItem2 = new MenuItem("Salmon Teriyaki","Grilled salmon with teriyaki sauce",11.99,"Entrees",true, today);
        MenuItem newItem3 = new MenuItem("Sushi Bento-box","4 variety of sushi side with vegetable tempura, house salad",14.99,"Entrees",false, today);

        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourLaunchMenu = new Menu(today, startingMenu);


        System.out.println("   +------------------------+");
        System.out.println("   |   Welcome to LC Cafe   |");
        System.out.println("   |          Menu          |");
        System.out.println("   +------------------------+");

        ourLaunchMenu.addItem(newItem1);
        ourLaunchMenu.addItem(newItem2);
        ourLaunchMenu.addItem(newItem3);

        ourLaunchMenu.printMenu();
        System.out.println("\n");

        ourLaunchMenu.addItem(newItem2);
    }
}
