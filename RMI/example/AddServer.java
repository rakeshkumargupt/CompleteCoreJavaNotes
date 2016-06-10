import java.net.*; //java networking package
import java.rmi.*;

public class AddServer 
{
public static void main(String args[]) 
{
try 
	{
	AddServerImpl addServerImpl = new AddServerImpl();
	//binding the server
	Naming.rebind("AddServer", addServerImpl);
	}
	catch(Exception e) 
	{
	System.out.println("Exception: " + e);
	}
}
}
