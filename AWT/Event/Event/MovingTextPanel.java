// MovingTextPanel.java - Demonstrates handling three kinds of keys:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

///////////////////////////////////////////////////////// class DrawingPanel
/** Define a new panel to draw on, therefore it has a paintComponent method.
    This class implements KeyListener, altho the listeners don't really 
    have to be inside this class.
    This class displays any characters that are typed, and handles
    virtual keys (arrows) and modifiers (shift) to move the text.
    @author Fred Swartz
    @version 2004-05-06
*/
public class MovingTextPanel extends JPanel implements KeyListener {
    //===================================================== field variables
    String display = ""; // Initial string to display
    private int x = 50;  // Initial coordinates of string
    private int y = 50;
    
    private Font biggerFont = new Font("sansserif", Font.PLAIN, 24);
    private int speed = 2; // number of pixels to move
    
    //========================================================= constructor
    public MovingTextPanel() {
        this.setBackground(Color.white);
        this.setFont(biggerFont);
        this.setPreferredSize(new Dimension(300, 200));
        this.addKeyListener(this);  // This class has its own key listeners.
        this.setFocusable(true);    // Allow panel to get focus
    }//endconstructor

    //======================================================= paintComponent
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(display, x, y);
    }//endmethod paintComponent

    //==================================================== keyTyped listener
    /** This listener is called for character keys. */
    public void keyTyped(KeyEvent kevt) {
        //System.out.println("keyTyped");
        char c = kevt.getKeyChar();
        if (c == '\b') { // if this is a backspace
            if (display.length() > 0) {  // remove last character
                display = display.substring(0, display.length()-1);
            }
        } else {
            display += c;
        }
        this.repaint();
    }//endmethod keyTyped

    //================================================== keyPressed listener
    /** This listener is called for both character and non-character keys. */
    public void keyPressed(KeyEvent e) {
        // Check the shift key, and do 10x the movement if the
        // shift key is down when the arrow keys are pressed.
        // Altho keyPressed is called for normal characters, they
        // are ignored here and handled in keyTyped.
        if (e.isShiftDown()) {
            speed = 10;
        } else {
            speed = 2;
        }        
        
        //-- Process arrow "virtual" keys
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT : x -= speed; x = Math.max(x, 0);   break;
            case KeyEvent.VK_RIGHT: x += speed; x = Math.min(x, 300); break;
            case KeyEvent.VK_UP   : y -= speed; y = Math.max(y, 0);   break;
            case KeyEvent.VK_DOWN : y += speed; y = Math.min(y, 200); break;
        }
        
        speed = 2;       // Restore speed to its default value
            
        this.repaint();  // Display the changes.
    }//endmethod keyPressed

    //------------------------------------------------- keyReleased listener
    public void keyReleased(KeyEvent ke) {}  // Ignore.
}//endclass MovingTextPanel
/*
<Applet Code="MovingTextPanel" Height=400 width=800>
</Applet>
*/