import java.awt.*;
import java.awt.event.*;
/*
<applet code="TestButtonAction" width=399 height=359>
</applet>
*/


public class TestButtonAction {
  public static void main(String[] args){
    Frame f = new Frame("TestButton");
    f.setSize(200,200);
    Button hw = new Button("Hello World!");
    f.add(hw);

    hw.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
	System.exit(0);
      }
    });
    f.setVisible(true);
  }
}
