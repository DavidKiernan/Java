package collectionsex;
import java.util.HashMap;
import java.util.Map;

public class Example4 {
    public static void main(String[] args) {
        Map<Country,String> countryNames = new HashMap<Country,String>();

        Country c1 = new Country("Cuba");
        Country c2 = new Country("Spain");
        Country c3 = new Country("France");
        Country c4 = new Country("England");
        Country c5 = new Country("Switzerland");
        Country c6 = new Country("Wales");
        Country c7 = new Country("Ireland");
        Country c8 = new Country("Germany");

        countryNames.put(c1, "Havana");
        countryNames.put(c2, "Madrid");
        countryNames.put(c3, "Paris");
        countryNames.put(c4, "London");
        countryNames.put(c5, "Berne");
        countryNames.put(c6, "Cardiff");
        countryNames.put(c7, "Dublin");
        countryNames.put(c8, "Berlin");

        String name1 = countryNames.get(c8);

        System.out.println(name1);
        String name2 = countryNames.get(c7);
        System.out.println(name2);

    }
}


