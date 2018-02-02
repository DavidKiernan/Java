package student;

/**
 *
 * @author David
 */
public class Student {
    String studentID;
    String name;
    String subject;
    int ca1Result;
    int ca2Result;

    //PRINT METHOD
    public void print () {
      System.out.println("Student Name Is : " + name);
      System.out.println("Student ID Is : "+ studentID);
      System.out.println("Student Subject Is : "+subject);
      System.out.println("Student CA 1 Result Is : "+ca1Result);
      System.out.println("Student CA 2 Result Is : "+ca2Result);
    }

    //Setter Method//

    public void setStudentID(String studentNum){
      this.studentID = studentNum;
    }
    //Getter Methods//
    public String getStudentID() {
      return studentID;
    }

    public void setName(String studentName){
      this.name = studentName;
    }
    public String getName() {
      return name;
    }

    public void setSubject(String studentSubject){
      this.subject = studentSubject;
    }
    public String getSubject() {
      return subject;
    }

    public void setCa1Result(int ca1) {
      this.ca1Result = ca1;
    }
    
    public int getCa1Result() {
      return ca1Result;
    }

    public void setCa2Result(int ca2) {
      this.ca2Result = ca2;
    }
    
    public int getCa2Result() {
      return ca2Result;
    }
  
}
