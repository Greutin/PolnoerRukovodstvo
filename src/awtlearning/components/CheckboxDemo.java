package awtlearning.components;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by denba on 07.12.2016.
 */
public class CheckboxDemo extends Applet implements ItemListener {

    private String msg = "";
    private Checkbox windows, android, solaris, mac;

    public void init()
    {
        windows = new Checkbox("Windows", null, true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        add(windows);
        add(android);
        add(solaris);
        add(mac);

        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g)
    {
        msg = "Current state: ";
        g.drawString(msg, 6, 80);
        msg = " Windows: " + windows.getState();
        g.drawString(msg, 6, 100);
        msg = " Android: " + android.getState();
        g.drawString(msg, 6, 120);
        msg = " Solaris: " + solaris.getState();
        g.drawString(msg, 6, 140);
        msg = " Mac OS: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
}
