package Lab3_PreparedStatement;

import java.sql.ResultSet;
import java.util.ResourceBundle;

/**
 * Created by David on 08/02/2015.
 */
public class TestContact {
    public static void main(String[] args) {
            ContactsDB con = new ContactsDB();
            con.openDB();
            con.dropTables();
            con.buildContactTable();
            con.add(5,"Timmy", "34 Sommerville Heights", "012334577", "tim@c.com");

            ResultSet rset = con.queryDB();
            try {
                while (rset.next()) {
                    System.out.println(rset.getInt(1) + " " + rset.getString(2)
                            + " " + rset.getString(3) + " " + rset.getString(4) + " " + rset.getString(5));

                }
            } catch (Exception ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }

            con.delete(5);

        try {
            rset = con.queryDB();
            while (rset.next()) {
                System.out.println(rset.getInt(1) + " " + rset.getString(2)
                        + " " + rset.getString(3) + " " + rset.getString(4) + " " + rset.getString(5));

            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

       // con.queryDB();
        con.closeDB();


    }
}
