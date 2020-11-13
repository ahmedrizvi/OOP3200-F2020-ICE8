/*
* Author: Ahmed Rizvi
* Date: 2020-11-13
 */

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String name = null;
        // Scanner needed for user inputs
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.printf("You entered: %s", name);
    }
}
