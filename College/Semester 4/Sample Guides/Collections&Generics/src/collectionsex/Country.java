package collectionsex;
public class Country {
    private String name;

    public Country(String c)
    {
        name=c;
    }

    public int hashCode(){
        return this.name.length();
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Country))
            return false;
        if (obj == this)
            return true;
        return this.name.equals(((Country) obj).name);
    }
}



