package motherboard;

public class MotherBoard {
    
    private String manufacturer;
    private int totalMemory;
    private  MemoryModule [] cap;

    public MotherBoard(){
        manufacturer="";
        totalMemory=0;
        cap=new MemoryModule[0];

    }

    public MotherBoard(String manufacturer,int totalMemory, int capacity) {
        this.manufacturer = manufacturer;
        this.totalMemory = totalMemory;

        cap = new MemoryModule[capacity];

        for (int i =0; i<cap.length; i++){
            cap[i]= new MemoryModule(totalMemory/capacity);
        }

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(int totalMemory) {
        this.totalMemory = totalMemory;
    }

    public  MemoryModule[] getCap() {
        return cap;
    }

    public void setCap(MemoryModule [] capacity) {
         this.cap=capacity;
    }

    @Override
    public String toString() {
        String s = "manufacturer: " + getManufacturer() +" containing: \n";
        for (int i = 0; i < cap.length; i++){
            s += cap[i].toString(i+1);
        }
        return s;
    }

    private class MemoryModule{
        private int capacity;

        private MemoryModule(int capacity) {
            this.capacity = capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public String toString(int i) {
            return  "module " + i + " size: " + capacity+"MB\n";
        }
    }
}
