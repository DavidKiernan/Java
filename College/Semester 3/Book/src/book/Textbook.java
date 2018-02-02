package book;

public class Textbook extends Book{
    private int grade;

    //CONSTRUCTOR

    public Textbook(String title, int numPages, int gradeIn)
    {
        super(title, numPages);
        grade=gradeIn;
    }

    //SET & GET FOR GRADE
    public void setGrade(int newGrade){
        grade=newGrade;
    }
    public int getGrade(){
        return grade;
    }

    //PRINT METHOD

    @Override
    public void print() {
        super.print();
        System.out.println("Grade Level Is "+grade + "\n");
    }
}
