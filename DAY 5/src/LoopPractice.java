public class LoopPractice
{
    // while loop
    public static void practiceWhileLoop()
    {
        System.out.println("\nwhile loop:");

        int x = 0;
        while (x < 5)
        {
            System.out.println("The value x is " + x);
            x++;
        }
    }

    // do-while loop
    public static void practiceDoWhileLoop()
    {
        System.out.println("\ndo-while loop:");

        int y = 0;
        do
        {
            System.out.println("The value of y is " + y);
            y++;
        }

        while (y < 5);
    }

    // for loop
    public static void practiceForLoop()
    {
        System.out.println("\nfor loop:");

        for (int j = 0; j < 5; j++)
        {
            System.out.println("The value of j is " +j);
        }
    }

    // Nested for loop
    public static void practiceNestedForLoops()
    {
        System.out.println("\nNested for loop:");

        for (int t = 0; t < 8; t++)
        {
            for (int l = 0; l < 8; l++)
            {
                System.out.println("(" + t + ", " + l + ")");
            }
        }
    }



    // break-for-loop
    public static void practiceForLoopBreak()
    {
        System.out.println("\nbreak-for-loop:");

        for (int i = 5; i > 0; i--)
        {
            System.out.println("The value of i is " +i);
            if (i == 3)
            {
                System.out.println("This is the end");
                break;
            }
        }
    }

    public static void main(String args[])
    {
        practiceWhileLoop();
        practiceDoWhileLoop();
        practiceForLoop();
        practiceNestedForLoops();
        practiceForLoopBreak();
    }
}