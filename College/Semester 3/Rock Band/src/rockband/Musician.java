package rockband;
public class Musician extends Person{
    private String instrument;

    public Musician(String name, String inst){
        super(name);
        instrument= inst;
    }

    public void setInstrument(String inst) {
        instrument = inst;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" plays "+ instrument);
    }
}
