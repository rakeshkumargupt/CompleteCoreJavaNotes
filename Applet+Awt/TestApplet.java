import java.applet.*;
import java.awt.*;

/*
<applet code="TestApplet.class" height="400" width="400">
</applet>
*/
public class TestApplet extends Applet
{

public void paint(Graphics g)
{
	g.drawString("Welcome! To Applet Programming",200,250);
}
}