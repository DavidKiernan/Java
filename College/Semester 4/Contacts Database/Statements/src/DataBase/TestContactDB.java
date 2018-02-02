package DataBase;

/**
 * Created by x00093830 on 04/02/2015.
 */
public class TestContactDB {
    public static void main(String[] args) {
        CreateContactsDB conDB = new CreateContactsDB();
        conDB.openDB();
        conDB.dropTables();
        conDB.buildContactTable();
        conDB.showDB();
        conDB.insert(5, "Timmy", "34 Sommerville Heights", "012334577", "tim@c.com");
        conDB.queryDB();
        conDB.showDB();
        conDB.closeDB();
    }
}
