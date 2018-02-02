package music;
public class TestMusic {

    public static void main(String[] args) {
        
        MusicOrganiser m = new MusicOrganiser();
        m.addFile("Stay with me");
        m.addFile("Take me to the church");
        m.addFile("Animals");
        m.listFiles();
        System.out.println("The number of files is: " + m.getNumberOfFiles());
        m.removeFile(2);
        m.listFiles();
    }
    
}
