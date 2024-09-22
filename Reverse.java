public class Main
{
    public static void main(String args[])
    {
        String str = "Yanga";
        System.out.println(reverseManually(str));
    }

    private static String reverseManually(String str)
    {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }
}