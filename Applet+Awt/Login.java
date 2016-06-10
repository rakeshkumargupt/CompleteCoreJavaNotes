import java.awt.*;
import java.applet.*;

/*
<applet code="Login.class" width=500 height=500>
</applet>
*/
public class Login extends Applet
{
//declare variable
Label l1,l2;
TextField t1,t2;
Button b1;

	public void start()
	{
	l1 = new Label("Username : ");
	l2 = new Label("Password : ");
	t1 = new TextField(20);
	t2 = new TextField(20);
	b1 = new Button("Login");
	
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b1);	
	}
}