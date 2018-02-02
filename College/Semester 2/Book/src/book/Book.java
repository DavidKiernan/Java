package book;

/**
 *
 * @author David
 */
public class Book {
    private String  isbn;
    private String  name;
    private String  author;
    private String  edition;

    //constructor method

    Book(String isbnIn, String nameIn, String authorIn, String editionIn){
      isbn=isbnIn;
      name=nameIn;
      author=authorIn;
      edition=editionIn;
    }

     //define a print method

    public void print() {
     System.out.println("Book Details");
     System.out.println("Title    Is : " + name);
     System.out.println("Author   Is : "+ author);
     System.out.println("Edition  Is : "+ edition);
     System.out.println("The ISBN Is : "+ isbn);
     System.out.println();
    }

     // Getter + setter method for edition 


     public String getEdition(){
     return edition;
     }
       public void setEdition(String newEdition){
       this.edition = newEdition;
     }

     //Getter + Setter Method For book name

     public String getName(){
       return name;
     }
     public void setName(String newName){
       this.name=newName;
     }

     public String getAuthor(){
       return author;
     }
     public void setAuthor(String newAuthor){
       this.author=newAuthor;
     }

     public String getIsbn(){
       return isbn;
     }
     public void setIsbn(String newIsbn){
       this.isbn=newIsbn;
     }
}
