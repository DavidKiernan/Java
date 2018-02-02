package DataBase;

/**
 * Created by David on 04/02/2015.
 */
import oracle.jdbc.pool.OracleDataSource;
import sun.util.calendar.BaseCalendar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateContactsDB {

    private Connection conn;
    private Statement stmt;
    private ResultSet rset;

    public void openDB() {
        String url;
        Scanner in = new Scanner(System.in);
        try {
            // Load the Oracle JDBC driver
            OracleDataSource ods = new OracleDataSource();

            System.out.println("Type global1 or home");
            String val = in.nextLine();

            if (val.equals("global1")) {
                ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
                System.out.println("Enter your user name:");
                String uName = in.nextLine();
                ods.setUser(uName);
                System.out.println("Enter your password:");
                String uPass = in.nextLine();
                ods.setPassword(uPass);
            } else if (val.equals("home")) {
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
    public void dropTables() {
        System.out.println("Checking for existing tables.");

        try {
            // Get a Statement object.
            stmt = conn.createStatement();


            try {
                // Drop the Contact table.
                stmt.execute("DROP TABLE Contact");
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
    public void buildContactTable(){
        try{
            Statement stmt = conn.createStatement();

            //Create Table
            stmt.executeUpdate("CREATE TABLE Contact (id NUMBER NOT NULL PRIMARY KEY,Con_Name VARCHAR2(30), Address VARCHAR2(255), Phone VARCHAR2(30), Email VARCHAR2(30) )");
            //INSERT Row1
            stmt.execute("INSERT INTO Contact VALUES ('1'," + "'Peter', " + "'23 Lime Lane', " + "'018976543', " + "'p.cassidy@b.com')");
            //Row 2
            stmt.execute("INSERT INTO Contact VALUES ('2'," + "'Donal', " + "'2 Shelbourne rd', " + "'012446578', " + "'d.oreilly@b.com')");
            //Row 3
            stmt.execute("INSERT INTO Contact VALUES ('3', " + "'Mary', " + "'4 Richmond rd', " + "'019887654', " + "'m.lawlor@b.com')");
            //Row 4
            stmt.execute("INSERT INTO Contact VALUES ('4'," + "'Glen', " + "'4 Richmond Lane', " + "'011223876', " + "'g.whelan@b.com')");


        }catch (SQLException ex){
            System.out.println("ERROR: "+ ex.getMessage());
        }
    }
    public void closeDB(){
        try{
            stmt.close();
            rset.close();
            conn.close();
        } catch (SQLException e){
            System.out.print("Could not close connection ");
            e.printStackTrace();
        }
    }
    // Show Database

    public void showDB(){
        String sqlStatement = "SELECT * FROM Contact";

        try{
            Statement stmt = conn.createStatement();
            // Send Statement to DBMS
            rset = stmt.executeQuery(sqlStatement);
            while(rset.next()){
                System.out.println(rset.getInt("id") + " " + rset.getString("con_Name") + " " + rset.getString("Address") + " " + rset.getString("Phone") + " " + rset.getString("Email"));
            }
        }catch (Exception ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
        System.out.println();
    }

    public void queryDB(){
        String sqlStatement = "SELECT * FROM Contact WHERE (con_Name) = 'Peter'";
        String countStatement = "SELECT COUNT (*) FROM Contact";
        String sortStatement = "SELECT * FROM Contact ORDER BY (con_Name) asc";

        try{
            Statement stmt = conn.createStatement();
            rset = stmt.executeQuery(countStatement);
            if (rset.next()) {
                System.out.println("Number of Contacts: " + rset.getInt(1));
                System.out.println();
            }

        }catch (Exception ex){
            System.out.println("ERROR: " + ex.getMessage());
        }

        try {
            // Send the statement to the DBMS.
            rset = stmt.executeQuery(sqlStatement);

            // Display the contents of the result set.
            // The result set will have three columns.
            if (rset.next()) {
                System.out.println(rset.getString("con_Name")+" "+rset.getString("Phone"));
                System.out.println();
            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        try{
           // Statement stmt = conn.createStatement();
            rset = stmt.executeQuery(sortStatement);
            while(rset.next()){
                System.out.println(rset.getInt("id")+" "+ rset.getString("con_Name")+" "+rset.getString("Address")+" "+ rset.getString("Phone")+" "+ rset.getString("Email"));
            }

        }catch (Exception ex){
           System.out.println("ERROR: " + ex.getMessage());
        }
        System.out.println();
    }
    public void insert(int number,String name, String address,String phone,String email)
    {
        try
        {
            // Create a string with an INSERT statement.
            String sqlStatement = "INSERT INTO Contact " +
                    "(id, con_Name, Address, Phone, Email) " +
                    "VALUES (" + number + ", '" + name + "', '" + address + "', '" +phone +"', '" + email + "' )";

            //to enter a String need to do '"+var+"' if another variable follows then for String '"+var+"','"+var2+"'
            // to enter a int or double need to do " + var3 +" if int or double follows then "+var3+","var4"
            // Send the statement to the DBMS.
            int rows = stmt.executeUpdate(sqlStatement);

            // Display the results.
            System.out.println(rows + " row(s) added to the table.");
            System.out.println();

        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
