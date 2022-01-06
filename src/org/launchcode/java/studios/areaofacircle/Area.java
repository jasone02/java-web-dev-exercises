package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String radius;
        boolean success = false;
        while (!success) {
            System.out.println("Enter a radius: ");
            radius = input.next();
            if (validateRadius(radius)) {
                double area = Circle.getArea(Double.parseDouble(radius));
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
                success = true;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    public static boolean validateRadius(String radius) {
        boolean isValid = true;
        boolean cont = true;
        if (radius.equals("")) {
            isValid = false;
        } else {
            try {
                Double.parseDouble(radius);
            }
            catch (NumberFormatException e){
                isValid = false;
                cont = false;
            }
            if (cont && Double.isNaN(Double.parseDouble(radius))) {
                isValid = false;
            } else if (cont && Double.parseDouble(radius) < 0) {
                isValid = false;
            }
        }
        return isValid;
    }
}
