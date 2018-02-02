// 24 Sept 2014
package book;
public class TestBook {
    public static void main(String[] args) {
        Textbook textbook1=new Textbook("Core Java",500,2);
        Novel novel1=new Novel("Pride & Prejudice",300,"Romance");

        textbook1.print();
        novel1.print();
    }
    
}
