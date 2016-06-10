import java.awt.*;
import java.awt.event.*;

class student_login extends Frame implements ActionListener
{
Label lblmsg;
Button btn,btn2;

student_login()
{
setLayout(new FlowLayout());
lblmsg = new Label("                                               ");
btn = new Button("Click Me");
btn2 = new Button("Click again");

btn.addActionListener(this);
btn2.addActionListener(this);

add(btn);
add(btn2);
add(lblmsg);

}

public void actionPerformed(ActionEvent ae)
{

if(ae.getActionCommand().equals("Click Me"))
lblmsg.setText("You Clicked Me...");
else
lblmsg.setText("You Clicked Me again...");

}

}


class login1
{
public static void main(String args[])
{
student_login obj = new student_login();
obj.setSize(500,400);
obj.setVisible(true);
}
}