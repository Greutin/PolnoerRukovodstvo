package events;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 * Created by denba on 27.11.2016.
 */
public class SimpleKey extends Applet implements KeyListener{
    String msg = "";
    int x = 10, y = 20;
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
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key Up");
    }

    public void paint(Graphics g){
        g.drawString(msg, x, y);

    }
}
