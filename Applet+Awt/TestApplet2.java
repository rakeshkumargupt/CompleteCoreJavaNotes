import java.applet.*;
import java.awt.*;

/*
<applet code="TestApplet2.class" height="600" width="400">
</applet>
*/
public class TestApplet2 extends Applet
{

public void paint(Graphics g)
{
        Dimension d = getSize();
        g.setColor(Color.BLACK);//to change the color of canvas/background
        g.fillRect(0, 0, d.width, d.height); // paint background
        g.setFont(new Font("San-serif", Font.BOLD, 44));
        g.setColor(new Color(255, 215,0));
        g.drawString("Amit Singh", 60, 430);
        g.drawImage(getImage(getCodeBase(), "102.jpg"),20, 60, this);

	//g.drawString("Welcome! To Applet Programming",100,150);

}
}