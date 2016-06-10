import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ActionListener {    
    Button hw;
    public MyFrame2(){
	super("Test Button");
	setSize(200,200);
	hw = new Button("Hello World!");
	add(hw);
	hw.addActionListener(this);
	//show();
    }
    
    public void actionPerformed(ActionEvent o){
	System.exit(0);
   }
}

class MyFrame
{
public static void main(String args[])
{
MyFrame2 obj = new MyFrame2();
obj.setVisible(true);
}
}
