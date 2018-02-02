package rockband;

public class Rockband {
    private String band;
    private String label;
    private Musician [] member;

    public Rockband(String b, String com, String[]mem, String[] inst){
        band=b;
        label=com;
        member= new Musician[mem.length];

        for(int i=0; i<member.length;i++){
            member[i]=new Musician(mem[i], inst[i]);
        }
    }
    public boolean changeRecordLabel(String labelIn) {

        if (label.equalsIgnoreCase(labelIn)) {
            System.out.println("Label not changed");
            return false;
        }
        else {
            label = labelIn;
            System.out.println("Label changed");
            return true;
        }
    }


    public void print(){
        System.out.println("Rock Band:");
        System.out.println("\t Name:"+band);
        System.out.println("\t Record company:"+label);
        for(int i=0; i<member.length;i++){
            System.out.println("\t\t"+member[i].getName()+" plays "+member[i].getInstrument());
        }
    }
}
