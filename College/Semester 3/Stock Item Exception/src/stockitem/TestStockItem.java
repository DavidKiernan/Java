package stockitem;
public class TestStockItem {

    public static void main(String[] args) throws BelowMinException, OutOfStockException, OverMaxException{
        
        StockItem shampoo = new StockItem(123, "Shampoo", 100,10,25);
        shampoo.takeOnStock(80);  // doesn't happen OverMaxException
	shampoo.issueStock(30);   // doesn't happen OutOfStockException
	shampoo.issueStock(20);   // 25-20 leaves 5 in stock and BelowMinException
		
	System.out.println("Amount left in stock is: "+shampoo.getInStock());
    }
    
}
