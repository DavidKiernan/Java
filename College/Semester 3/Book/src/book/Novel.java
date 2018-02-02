package book;

public class Novel extends Book {
    
    private String genre;

    //CONSTRUCTOR
    public Novel(String title, int numPages, String genreIn)
    {
        super(title, numPages);
        genre=genreIn;
    }

    //SET AND GET FOR GENRE
    public void setGenre(String newGenre){
        genre=newGenre;
    }
    public String getGenre(){
        return genre;
    }

    //PRINT METHOD

    @Override
    public void print() {
        super.print();
        System.out.print("Genre "+genre +"\n");
    }
}
