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
