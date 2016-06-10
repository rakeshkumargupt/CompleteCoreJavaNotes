import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ActionListener {    
    Button hw;
    Button hw2;
    TextField tf1;
    TextField tf2;
	Label lbl1;
	Label lbl2;
TextField tf3;
    public MyFrame2(){
	
	super("Login Form");
setLayout(new FlowLayout());
	setSize(600,400);
	lbl1 = new Label("Username:");
	add(lbl1);
	tf1= new TextField(20);
	//tf1.setEchoChar('*');
	add(tf1);
lbl2 = new Label("Password:");
	add(lbl2);
	tf2= new TextField(20);
	//tf1.setEchoChar('*');
	add(tf2);
	hw = new Button("Login");
	add(hw);
	hw.addActionListener(this);
tf3= new TextField(20);
	//tf1.setEchoChar('*');
	add(tf3);
	//show();
    }
    
    public void actionPerformed(ActionEvent o){

	String s1 = tf1.getText();
	String s2 = tf2.getText();
	String s3 = s1 + " " + s2;
	tf3.setText(s3);
	//System.exit(0);
   }
}

class MyLogin
{
public static void main(String args[])
{
MyFrame2 obj = new MyFrame2();
obj.setVisible(true);
}
}
