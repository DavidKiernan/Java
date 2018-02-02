package university;

public class University {
    
    private String uName;
    private  Department [] dList;

    public University (String uName,String[]dNames, int[]id) {
        this.uName = uName;
        dList = new Department[dNames.length];

        for (int i = 0; i < dNames.length; i++) {
        dList[i] = new Department(dNames[i], id[i]);
    }
}

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getUName() {
        return uName;
    }

    public void showList(){
        for(int i=0; i<dList.length; i++) {
            System.out.println(dList[i].getName()+": "+dList[i].getDId());
        }
    }

    public void changeDepName(String old, String newName){
        for(int i=0; i< dList.length;i++){
            if (dList[i].getName().equalsIgnoreCase(old)){
                dList[i].setName(newName);
            }
        }
    }

    private class Department{
        private String name;
        private int dId;

        public Department(String n, int id){
            name=n;
            dId=id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDId() {
            return dId;
        }

        public void setDId(int dId) {
            this.dId = dId;
        }
    }
}
