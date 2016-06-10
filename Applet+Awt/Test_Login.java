import java.awt.*;
import java.awt.event.*;

class LoginUser extends Frame implements ActionListener
{
Label lbluser,lblpwd;
TextField txtuser,txtpwd;
Button btnsubmit,btnclear;
Checkbox chk1;
Choice user_type;
LoginUser()
{
setLayout(new FlowLayout());
lbluser = new Label("Username: ");
lblpwd  = new Label("Password: ");
txtuser = new TextField(20);
txtpwd = new TextField(20);
btnsubmit = new Button("Login");
btnclear = new Button("Clear");
chk1 = new Checkbox("Remember me next");
user_type = new Choice();
user_type.add("Administrator");
user_type.add("Employee");
user_type.add("Customer");
btnclear.addActionListener(this);
add(lbluser);add(txtuser);
add(lblpwd); add(txtpwd);
add(user_type);
add(btnsubmit); add(btnclear);
add(chk1);

	
}

public void actionPerformed(ActionEvent ae)
{
	txtuser.setText(" ");
	txtpwd.setText(" ");
}
}	


class Test_Login
{
public static void main(String arg[])
	{
	LoginUser obj = new LoginUser();
	obj.setSize(400,400);
	obj.setVisible(true);
	}
}