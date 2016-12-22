package awtlearning.components;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by denba on 07.12.2016.
 */
public class ChoiceDemo extends Applet implements ItemListener {
    Choice os, browser;
    String msg = "";

    public void init(){
        os = new Choice();
        browser = new Choice();

        os.add("Windows");
        os.add("Mac OS");
        os.add("Android");
        os.add("Solaris");
        os.add("Linux");

        browser.add("Firefox");
        browser.add("Chrome");
        browser.add("Yandex");
        browser.add("Safari");
        browser.add("Tor");

        add(os);
        add(browser);

        os.addItemListener(this);
        browser.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }

    public void paint(Graphics g){
        msg = "Current OS: " + os.getSelectedItem();
        g.drawString(msg, 6, 120);
        msg = "Current Browser: " + browser.getSelectedItem();
        g.drawString(msg, 6, 140);
    }
}
