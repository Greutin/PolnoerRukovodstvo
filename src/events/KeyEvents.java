package events;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/**
 * Created by denba on 27.11.2016.
 */
public class KeyEvents extends Applet implements KeyListener {
    String msg = "";
    int X = 0, Y = 20;

    public void init()
    {
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key Down");
        int key = e.getKeyCode();
        switch (key)
        {
            case KeyEvent.VK_F1:
                msg += "<F1>";
                break;
            case KeyEvent.VK_F2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "<PgUp>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "<PgDn>";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<Right Arrow>";
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key Up");
    }

    public void paint(Graphics g){
        g.drawString(msg, X, Y);
    }
}
