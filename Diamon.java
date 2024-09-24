import java.util.Scanner;

public class Main {
    public static void drawDiamond(int sizeOfShape, int xCentre, int yCentre) {
        for (int row = 1; row <= 25; row++) {
            for (int col = 1; col <= 79; col++) {
                if (row % 10 == 0 || col % 10 == 0) {
                    System.out.print("=");  // Draw the grid lines
                } else {
                    int distanceX = Math.abs(col - xCentre);
                    int distanceY = Math.abs(row - yCentre);

                    // Check if within diamond bounds using Manhattan distance
                    if (distanceX + distanceY <= sizeOfShape) {
                        // Center of the diamond
                        if (col == xCentre && row == yCentre) {
                            System.out.print("*");  // Center symbol
                        } else {
                            System.out.print("$");  // Diamond shape symbol
                        }
                    } else {
                        System.out.print(" ");  // Empty space outside the diamond
                    }
                }
            }
            System.out.println();  // New line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfShape = 0;
        int xCentre = 0;
        int yCentre = 0;

        // Input validation for size of shape
        while (true) {
            System.out.print("Enter size of the shape (2-9): ");
            sizeOfShape = scanner.nextInt();
            if (sizeOfShape >= 2 && sizeOfShape <= 9) break;
            System.out.println("Size of the shape must be between 2 and 9.");
        }

        // Input validation for xCentre
        while (true) {
            System.out.print("Enter xCentre (1-79): ");
            xCentre = scanner.nextInt();
            if (xCentre >= 1 && xCentre <= 79) break;
            System.out.println("xCentre must be between 1 and 79.");
        }

        // Input validation for yCentre
        while (true) {
            System.out.print("Enter yCentre (1-25): ");
            yCentre = scanner.nextInt();
            if (yCentre >= 1 && yCentre <= 25) break;
            System.out.println("yCentre must be between 1 and 25.");
        }

        System.out.println("(sizeOfShape = " + sizeOfShape + ", xCentre = " + xCentre + ", yCentre = " + yCentre + ")");
        drawDiamond(sizeOfShape, xCentre, yCentre);
    }
}
