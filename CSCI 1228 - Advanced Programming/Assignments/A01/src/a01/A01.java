/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;

import java.util.Scanner;

/**
 * This program converts 24 clock formatted time input into a 12 hour clock
 * formatted time
 *
 * @author Shevan Walimini Devage (A00490556)
 */
public class A01 {

    public static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {

        //print info
        System.out.println("Assignment 01");
        System.out.println("Walimini Devage, Shevan");
        System.out.println("A00490556");
        System.out.println("This program converts 24 clock formatted time "
                + "input into a 12 hour clock formatted time\n\n");

        //Create Variables
        int num = 0;
        String resp;
        boolean IsNum = true;
        int hour, minutes, hour12;
        String meridiem;

        //get the 24h time from the user
        System.out.print("Enter a 4 digit 24h time:  ");
        resp = kbd.next();
        kbd.nextLine();

        //check if the time is valid and it contains 4 digits
        if (resp.length() != 4) {
            IsNum = false;
        } else {
            for (int i = 0; i < resp.length(); i++) {
                if (!Character.isDigit(resp.charAt(i))) {
                    IsNum = false;
                    break;
                }
            }
        }
        if (!IsNum) {
            System.out.println("Error: Invalid input " + resp);
            System.out.println("Press enter to end");
            kbd.nextLine();
            return;
        }

        //time conversion
        num = Integer.parseInt(resp);
        hour = num / 100;
        minutes = num % 100;
        meridiem = (hour < 12) ? "AM" : "PM";

        //additional logic to check if the time is in right format
        if (0 > hour || hour > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid 24-hour time");
            return;
        }

        //conversion
        hour12 = (hour == 0 || hour == 12) ? 12 : hour % 12;

        //final output
        System.out.printf("%s is %02d:%02d %s\n", resp,
                hour12, minutes, meridiem);
        System.out.println("Press enter to end");
        kbd.nextLine();

    }

}
