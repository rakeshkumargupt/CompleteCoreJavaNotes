import java.awt.*;
import java.applet.Applet;

/*
<applet code="HelloWorldApplet.class" width=500 height=350></applet>
*/
public class HelloWorldApplet extends Applet 
{
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
