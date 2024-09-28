/*
Description
    Purpose: The program draws a diamond shape on the console, centered at a specified coordinate within a defined grid size. 
    The size of the diamond is determined by user input, as well as the center coordinates.

    Key Methods:
        drawDiamond(int sizeOfShape, int xCentre, int yCentre): This method handles the drawing of the diamond.
            It iterates through a 25-row by 79-column grid.
            For each cell in the grid:
                If the row or column is a multiple of 10, it prints an equal sign (=).
                It calculates the Manhattan distance from the center to determine if a position is within the diamond's bounds.
                It prints a dollar sign ($) if within bounds, otherwise a space.

    Main Method:
        Prompts the user for the size of the diamond (between 2 and 9).
        Prompts for the center coordinates, ensuring they fall within the valid ranges (1-79 for x and 1-25 for y).
        Calls drawDiamond() with the user-provided parameters.
*/

import java.util.Scanner;

public class Diamond 
{
    public static void drawDiamond(int sizeOfShape, int xCentre, int yCentre) 
    {
        for (int row = 1; row <= 25; row++) 
        {
            for (int col = 1; col <= 79; col++) 
            {
                if (row % 10 == 0 || col % 10 == 0) 
                {
                    System.out.print("=");
                }
                
                else 
                {
                    int distanceX = Math.abs(col - xCentre);
                    int distanceY = Math.abs(row - yCentre);

                    if (distanceX + distanceY <= sizeOfShape) 
                    {
                        if (col == xCentre && row == yCentre)
                        {
                            System.out.print("*");
                        } 
                        
                        else
                        {
                            System.out.print("$");
                        }
                    } 
                    
                    else 
                    {
                        System.out.print(" ");
                    }
                }
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sizeOfShape = 0;
        int xCentre = 0;
        int yCentre = 0;

        while (true)
        {
            System.out.print("Enter size of the shape (2-9): ");
            sizeOfShape = scanner.nextInt();
            if (sizeOfShape >= 2 && sizeOfShape <= 9) break;
            System.out.println("Size of the shape must be between 2 and 9.");
        }

        while (true) 
        {
            System.out.print("Enter xCentre (1-79): ");
            xCentre = scanner.nextInt();
            if (xCentre >= 1 && xCentre <= 79) break;
            System.out.println("xCentre must be between 1 and 79.");
        }

        while (true)
        {
            System.out.print("Enter yCentre (1-25): ");
            yCentre = scanner.nextInt();
            if (yCentre >= 1 && yCentre <= 25) break;
            System.out.println("yCentre must be between 1 and 25.");
        }

        System.out.println("(sizeOfShape = " + sizeOfShape + ", xCentre = " + xCentre + ", yCentre = " + yCentre + ")");
        drawDiamond(sizeOfShape, xCentre, yCentre);
    }
}
