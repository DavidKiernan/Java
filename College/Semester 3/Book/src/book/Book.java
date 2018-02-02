package book;
public class Book {
    private String title;
    private int numPages;

    // CONSTRUCTOR

    public Book(String titleIn, int numPagesIn){
        title=titleIn;
        numPages=numPagesIn;
    }

    //SETTER & GETTER METHOD IN ORDER OF SET THEN GET
    public void setTitle(String newTitle){
        title=newTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setNumPages(int pageNum){
        numPages=pageNum;
    }

    public int getNumPages(){
        return numPages;
    }

    //PRINT METHOD
    public void print(){
        System.out.println("Book "+title+" Has "+numPages+" Pages");
    }
}
