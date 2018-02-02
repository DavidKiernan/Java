package ex1;

public class Account {
    private int account[];
    private int lastOp;

    public Account(){
        lastOp=0;
        account=new int[100];
    }

    public void deposit(int value){
        System.out.println("deposit"+lastOp);



        account[lastOp]=value;
        lastOp++;
        System.out.println("deposit"+lastOp);
    }

    public void withdraw(int value) {
        account[lastOp]=value;
        lastOp++;
      //  System.out.println("withdraw"+lastOp);
    }

    public int updates()
    {
        int result = 0;
        for (int i=0; i<account.length; i++) {
            result = result + account[i];
        }
        return result;
    }
}



