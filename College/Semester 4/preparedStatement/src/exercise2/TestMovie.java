package exercise2;

import java.sql.ResultSet;

public class TestMovie {
    public static void main(String[] args) {
        MovieDB mt = new MovieDB();
        mt.openDB();
        mt.dropTables();
        mt.buildMovieTable();

        ResultSet rset = mt.queryDB();

        try {
            while (rset.next()) {
                System.out.println(rset.getInt(1) + " " + rset.getString(2)
                        + " " + rset.getString(3) + " " + rset.getString(4));

            }
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }


        mt.deleteRecord(1);
        rset = mt.queryDB();
        try {
            while (rset.next()) {
                System.out.println(rset.getInt(1) + " " + rset.getString(2)
                        + " " + rset.getString(3) + " " + rset.getString(4));

            }
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        mt.closeDB();
    }
}
