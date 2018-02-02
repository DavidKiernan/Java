package rsi;
public class RSIException extends Exception
{
    public RSIException(String error)
    {
            super("Invalid the social security number, " + error);
    }
}
