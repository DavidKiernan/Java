package exercise2;

import java.sql.*; // Needed for JDBC classes
import java.util.Scanner;

import oracle.jdbc.pool.OracleDataSource;

public class MovieDB {
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
    public void buildMovieTable() {
        try {
            String sql1 = "CREATE TABLE Movie "
                    + "(id NUMBER PRIMARY KEY, title VARCHAR2(35), actor VARCHAR2(20), genre VARCHAR2(30))";
            // Get a Statement object.
            pstmt = conn.prepareStatement(sql1);
            // Create the table.
            pstmt.executeUpdate();

            String sql2 = "INSERT INTO Movie VALUES (?,?,?,?)";
            pstmt = conn.prepareStatement(sql2);
            // Insert row #1.
            pstmt.setInt(1, 1);
            pstmt.setString(2, "The Kings Speech");
            pstmt.setString(3, "Colin Firth");
            pstmt.setString(4, "Drama");
            pstmt.executeUpdate();

            // Insert row #2.
            pstmt.setInt(1, 2);
            pstmt.setString(2, "The Black Swan");
            pstmt.setString(3, "Natalie Portman");
            pstmt.setString(4, "Psychological Thriller");
            pstmt.executeUpdate();


            // Insert row #3.
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Harry Potter and the Deadly Hollows");
            pstmt.setString(3, "Emma Watson");
            pstmt.setString(4, "Fantasy");
            pstmt.executeUpdate();

            // Insert row #4.
            pstmt.setInt(1, 4);
            pstmt.setString(2, "Gravity");
            pstmt.setString(3, "Sandra Bullock");
            pstmt.setString(4, "Scifi");
            pstmt.executeUpdate();


            System.out.println("Movie table created.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
        public ResultSet queryDB() {
            String sqlStatement = "SELECT * FROM Movie";
            try {
                pstmt = conn.prepareStatement(sqlStatement,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                rset = pstmt.executeQuery();
            } catch (Exception ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }

            return rset;
        }
    public void add(int id, String t, String a, String g) {
        try {
            String queryString = "Select id, title, actor, genre from Movie";
            pstmt = conn .prepareStatement(queryString, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rset = pstmt.executeQuery();

            rset.moveToInsertRow();
            rset.updateInt(1, id);
            rset.updateString(2, t);
            rset.updateString(3, a);
            rset.updateString(4, g);
            rset.insertRow();
            pstmt.executeUpdate();

        } catch (SQLException e2) {
            System.out.println("Error going to previous row");
            System.exit(1);
        }
    }
    public void deleteRecord(int id) {
        try {
            String deleteString = "Select id, title, actor, genre from Movie where id = " + id ;
            pstmt = conn.prepareStatement(deleteString,
                    ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

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
    }
    public void dropTables() {
        System.out.println("Checking for existing tables.");

        try {
            // Get a Statement object.
            pstmt = conn.prepareStatement("DROP TABLE Movie");

            try {
                // Drop the Coffee table.
                pstmt.execute();
                System.out.println("Coffee table dropped.");
            } catch (SQLException ex) {
                // No need to report an error.
                // The table simply did not exist.
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
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
