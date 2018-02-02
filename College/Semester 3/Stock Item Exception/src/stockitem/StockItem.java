package stockitem;

public class StockItem {
    private int id;
    private String description;
    private int max;
    private int min;
    private int inStock;

    public StockItem(int i, String d, int mx, int mn, int in)
    {
        this.id = i;
        this.description = d;
        this.max = mx;
        this.min = mn;
        this.inStock = in;
    }

    public void takeOnStock(int qty) throws OverMaxException
    {
        try
        {
        if ((qty + inStock) > max)
          throw new OverMaxException();
          else
          inStock = inStock + qty;
        }
        catch (OverMaxException e) {
            System.out.println(e.getMessage());
        }
    }

    public void issueStock(int qty) throws BelowMinException, OutOfStockException
    {
        try
        {
            if (inStock-qty <=0)
                throw new OutOfStockException();
            else if ((inStock - qty) <= min)
            {
                inStock = inStock - qty;
                throw new BelowMinException();
            }
            else
            inStock = inStock-qty;
        }
        catch (OutOfStockException e)
        {
            System.out.println(e.getMessage());
        }
        catch (BelowMinException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public int getInStock()
    {
        return inStock;
    }
}
