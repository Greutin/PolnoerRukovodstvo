package awtlearning.components.layoutmanagers;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by denba on 08.12.2016.
 */
public class GridBagLayoutDemo extends Applet implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;

    public void init(){
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);
        windows = new Checkbox("Windows", null, true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        gbc.weightx = 1.0;
        gbc.ipadx = 200;
        gbc.insets = new Insets(4, 4, 0, 0);

        gbc.anchor = GridBagConstraints.NORTHEAST;

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(windows, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(android, gbc);

        gbc.weighty = 1.0;

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(solaris, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(mac, gbc);

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

    public void paint(Graphics g){
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