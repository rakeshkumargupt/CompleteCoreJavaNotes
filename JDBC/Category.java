import java.sql.*;

import java.util.*;

class Category
{
public static void main(String args[])
{
Scanner scn = new Scanner(System.in);

System.out.print("Enter Category Code : ");
String code = scn.nextLine();

System.out.print("Enter Category Name : ");
String name = scn.nextLine();

System.out.print("Enter Category Desc : ");
String desc = scn.nextLine();

//code for connecting to Oracle Server

//to load oracle driver


try
{

            Class.forName("oracle.jdbc.driver.OracleDriver");

            //to specify oracle server properties
String serverName = "localhost";
    String portNumber = "1521";
    String sid = "XE";
    String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
    String uname = "library";
    String pwd = "library";
   Connection con = DriverManager.getConnection(url, uname, pwd);

          String SQL = "insert into category values(?,?,?)";    
       PreparedStatement pst = con.prepareStatement(SQL);

	pst.setString(1,code);
	pst.setString(2,name);
	pst.setString(3,desc);

	pst.executeUpdate();

	System.out.println("Record Saved!!!");
}

catch(Exception ex)
{
ex.printStackTrace();
}
}
}