/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the length of the ceiling?");
        int roomLength = myObj.nextInt();

        System.out.println("What is the width of the ceiling?");
        int roomwidth = myObj.nextInt();

        double constant = 350.0;

        int area = roomLength * roomwidth;

        double gallons = Math.ceil(area / constant);

        System.out.println("You will need to purchase " + (int)gallons + " of paint to cover " + area + " square feet.");
        myObj.close();
    }
}