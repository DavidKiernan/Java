package music;

import java.util.ArrayList;
public class MusicOrganiser {
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    public MusicOrganiser()
    {
        files = new ArrayList<String>();
    }

    public void addFile(String filename)
    {
        files.add(filename);
    }


    public int getNumberOfFiles()
    {
        return files.size();
    }
    public void listFiles()
    {
        for(int i=0;i<files.size();i++)
        {
            System.out.println(files.get(i));
        }
    }
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
}
