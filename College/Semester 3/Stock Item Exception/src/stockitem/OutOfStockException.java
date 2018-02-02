package stockitem;
public class OutOfStockException extends Exception{
    public OutOfStockException()
    {
        super("Warning: Out of Stock");
    }
}
