import java.awt.*;
import java.applet.Applet;

/*
<applet code="HelloWorldApplet2.class" width=500 height=350></applet>
*/
public class HelloWorldApplet2 extends Applet 
{

public void start()
{
Label lbl = new Label("Enter Name : ");
TextField tf = new TextField(10);
Button b1 = new Button("Click");

add(lbl);
add(tf);
add(b1);
}

    public void paint(Graphics g) 
	{
        Dimension d = getSize();
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, d.width, d.height); // paint background
        g.setFont(new Font("San-serif", Font.BOLD, 44));
        g.setColor(new Color(255, 215,0));
        g.drawString("Hello, world!", 160, 80);
        g.drawImage(getImage(getCodeBase(), "Rabbit.jpg"),20, 60, this);


    }    
}
