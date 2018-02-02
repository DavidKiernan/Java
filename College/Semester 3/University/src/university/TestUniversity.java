package university;

public class TestUniversity {
    public static void main(String[] args) {
        
        int[] ids = {1, 2, 3, 4};
        String[] names = {"Computing", "Business", "Languages", "Engineering"};

        University u = new University("DCU", names, ids);
        u.showList();
        System.out.println("\nBusiness is now Business & Marketing \n");
        u.changeDepName("Business", "Business & Marketing");
        u.showList();
    }
    
}
