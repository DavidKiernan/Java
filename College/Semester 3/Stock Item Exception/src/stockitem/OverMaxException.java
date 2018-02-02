package stockitem;

public class OverMaxException extends Exception{
    public OverMaxException()
    {
        super ("Warning: Stock is over the maximum allowed limit");
    }
}
