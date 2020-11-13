/*
* Author: Ahmed Rizvi
* Date: 2020-11-13
 */

package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /* Input */

        String name = null;
        float age = 0.0f;
        // Scanner needed for user inputs
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = s.nextLine();


        boolean dirtyFlag = true;
        while(dirtyFlag)
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = s.nextFloat();
                dirtyFlag = false;

                // Age is equal to 0
                if (age <= 0.0f || age >= 120.0f)
                {
                    System.out.println("Error: You must enter an age greater than 0.0 and less than 120.0 years old");
                    // Needed to flush the scanner
                    s.nextLine();
                    dirtyFlag = true;
                }
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must enter a valid floating-point number");
                dirtyFlag = true;
                // Needed to flush the scanner
                s.nextLine();
            }
        }

        // Multi-dimensional array
        System.out.println();
        System.out.println("Multi-Dimensional array");
        int rows = 8;
        int cols = 8;
        float[][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                board[x][y] = (float)(Math.random() * 100.0) + 1.0f;
            }
        }

        System.out.println("Showing 10 random values:");

        for (int i = 0; i < 10; i++) {
            var randRows = (int)(Math.random() * rows);
            var randCols = (int)(Math.random() * cols);
            System.out.print("For row: " + randRows + " col: " + randCols);
            System.out.printf(", the random number is: %.2f", board[randRows][randCols]);
            System.out.println();
        }


        /* Output */

        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f \n", age);
    }
}
