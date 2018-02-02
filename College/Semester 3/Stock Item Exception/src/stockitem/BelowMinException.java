package stockitem;

public class BelowMinException extends Exception{
    public BelowMinException()
    {
        super ("Warning: Stock below acceptable minimum level ");
    }
}
