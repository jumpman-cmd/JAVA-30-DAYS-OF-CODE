public class Book
{
    // PROPERTIES, FIELDS
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckOut;
    int dayCheckOut = -1;

    // CONSTRUCTOR
    public Book(String bookTitle, int bookPageCount, int bookISBN)
    {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckOut = false;
    }

    // GETTERS
    public String getTitle()
    {
        return this.title;
    }

    public int getPageCount()
    {
        return this.pageCount;
    }

    public int getISBN()
    {
        return this.ISBN;
    }

    public boolean getIsCheckOut()
    {
        return this.isCheckOut;
    }

    public int getDayCheckOut()
    {
        return this.dayCheckOut;
    }

    // SETTERS
    public void setIsCheckOut(boolean newIsCheckOut, int currentDayCheckOut)
    {
        this.isCheckOut = newIsCheckOut;
    }

    public void setDayCheckOut(int day)
    {
        this.dayCheckOut = day;
    }
}