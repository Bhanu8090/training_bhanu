package project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 class Userlogin extends UserAuthentication{
    private static Connection connection = null;
    private static Statement stmt = null;

    private static void createConnection()
    {
        try
        {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample1;create=true","user","user");
	 }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    private static void insertInvoicedetails(String userid, String Product,float Quantity,float billamount)
    {
        try
        {
            stmt = connection.createStatement();
            String query ="INSERT INTO APP.INVOICEDETAILS values('"+userid+"','"+Product+"',"+Quantity+","+billamount+")";
            

            System.err.println(query);
                 stmt.executeUpdate(query);
                 System.out.println("Values inserted");
         stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    public static void main(String[] args){
	   Userlogin obj1=new Userlogin();
	   obj1.login();
	   Store obj2 = new Store();
	   obj2.login();
	   }
 }
 
 
