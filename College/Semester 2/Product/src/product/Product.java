package product;

/**
 *
 * @author David
 */
public class Product {
    
    //Instance Variables//
    String productName;
    int productCode;
    int onHand; //stock on hand//
    double costPrice;
    double sellingPrice;

    public void print(){
      System.out.println("The Product Is "+productName);
      System.out.println("Stock On Hand Is "+onHand);
      System.out.println("The Product Code Is "+productCode);
      System.out.println("The Cost Of The Product Is £"+costPrice);
      System.out.println("Sell The Product For £"+sellingPrice);
      System.out.println("");
    }

    //Setter & Getter Method//

    public void setproductName(String product){
      this.productName=product;
    }
    public String getproductName(){
      return productName;
    }

    public void setproductCode(int prodID){
      this.productCode=prodID;
    }
    public int getproductCode(){
      return productCode;
    }

    public void setonHand(int stock){
      this.onHand=stock;
    }
    public int getonHand(){
      return onHand;
    }

    public void setcostPrice(double cost){
      this.costPrice=cost;
    }
    public double getcostPrice(){
      return costPrice;
    }

    public void setsellingPrice(double sell){
      this.sellingPrice=sell;
    }
    public double getsellingPrice(){
      return sellingPrice;
    } 

    public void setstockIn(int amount){
      onHand+=amount;
    }
    
}
