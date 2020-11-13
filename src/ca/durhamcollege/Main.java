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
        /* Input */

        String name = null;
        float age = 0.0f;
        // Scanner needed for user inputs
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();

        System.out.println();

        /* Output */

        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f \n", age);
    }
}
