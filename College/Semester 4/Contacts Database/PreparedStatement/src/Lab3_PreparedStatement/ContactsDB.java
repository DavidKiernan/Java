package Lab3_PreparedStatement;
/**
 * Created by David on 08/02/2015.
 */
import java.sql.*; // Needed for JDBC classes
import java.util.Scanner;
import oracle.jdbc.pool.OracleDataSource;

public class ContactsDB {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rset;


    public void openDB() {
        String url;
        Scanner in = new Scanner(System.in);
        try {
            // Load the Oracle JDBC driver
            OracleDataSource ods = new OracleDataSource();

            System.out.println("Type global1 or home");
            String val = in.nextLine();

            if(val.equals("global1"))
            {
                ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
                System.out.println("Enter your user name:");
                String uName = in.nextLine();
                ods.setUser(uName);
                System.out.println("Enter your password:");
                String uPass = in.nextLine();
                ods.setPassword(uPass);
            }
            else if(val.equals("home"))
            {
                ods.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
                System.out.println("Enter your user name:");
                String uName = in.nextLine();
                ods.setUser(uName);
                System.out.println("Enter your password:");
                String uPass = in.nextLine();
                ods.setPassword(uPass);
            }

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (Exception e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }
    public void buildContactTable() {
        try {
            String sql1 = "CREATE TABLE Contact "
                    + "(id NUMBER PRIMARY KEY, name VARCHAR2(50), address VARCHAR2(50), phone VARCHAR2(50), email VARCHAR2(50))";
            // Get a Statement object.
            pstmt = conn.prepareStatement(sql1);
            // Create the table.
            pstmt.executeUpdate();

            String sql2 = "INSERT INTO Contact VALUES (?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql2);
            // Insert row #1.
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Peter");
            pstmt.setString(3, "23 Lime Lane");
            pstmt.setString(4, "018976543");
            pstmt.setString(5, "p.cassidy@b.com");
            pstmt.executeUpdate();

            // Insert row #2.
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Donal");
            pstmt.setString(3, "2 Shelbourne rd");
            pstmt.setString(4, "012446578");
            pstmt.setString(5, "d.oreilly@b.com");
            pstmt.executeUpdate();


            // Insert row #3.
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Mary");
            pstmt.setString(3, "4 Richmond rd");
            pstmt.setString(4, "019887654");
            pstmt.setString(5, "m.lawlor@b.com");
            pstmt.executeUpdate();

            // Insert row #4.
            pstmt.setInt(1, 4);
            pstmt.setString(2, "Glen");
            pstmt.setString(3, "4 Richmond Lane");
            pstmt.setString(4, "011223876");
            pstmt.setString(5, "g.whelan@b.com");
            pstmt.executeUpdate();


            System.out.println("Contact table created.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    public ResultSet queryDB() {
        String sqlStatement = "SELECT * FROM Contact";
        try {
            pstmt = conn.prepareStatement(sqlStatement,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY );
            rset = pstmt.executeQuery();
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

        return rset;
    }
    public void add(int id, String name, String address, String phone, String email) {
        try {
            String queryString = "Select id, name, address, phone, email from Contact";
            pstmt = conn .prepareStatement(queryString, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rset = pstmt.executeQuery();

            rset.moveToInsertRow();
            rset.updateInt(1, id);
            rset.updateString(2, name);
            rset.updateString(3, address);
            rset.updateString(4, phone);
            rset.updateString(5, email);
            rset.insertRow();
            pstmt.executeUpdate();

            System.out.println("Row(s) added");

        } catch (SQLException e2) {
            System.out.println("Error going to previous row");
            System.exit(1);
        }
        //return rset;
    }
    public void delete(int id) {
        try {
            String deleteString = "Select id, name, address, phone, email from Contact where id = " + id ;
            pstmt = conn.prepareStatement(deleteString,ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

            rset = pstmt.executeQuery();
            if (rset.next())       // try to go to row
            {
                System.out.println("Deleting..");
                rset.deleteRow();  // delete the row from the database and result set
                System.out.println("Row deleted");
            }
        } catch (SQLException e) {
            System.out.print("SQL Exception - Record could not be deleted " + e);
            System.exit(1);
        }
        //return rset;
    }
    public void dropTables() {
        System.out.println("Checking for existing tables.");

        try {
            // Get a Statement object.
            pstmt = conn.prepareStatement("DROP TABLE Contact");

            try {
                // Drop the Contact table.
                pstmt.execute();
                System.out.println("Contact table dropped.");
            } catch (SQLException ex) {
                // No need to report an error.
                // The table simply did not exist.
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    // This will close the table variable.close()
    public void closeDB() {
        try {
            pstmt.close();
            rset.close();
            conn.close();
            System.out.print("Connection closed");
        } catch (SQLException e) {
            System.out.print("Could not close connection ");
            e.printStackTrace();
        }
    }
}
