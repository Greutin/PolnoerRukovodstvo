package applets;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Denis on 24.11.2016.
 * <applet code="Sample" width=300 height=50></applet>
 */
public class Sample extends Applet {
    String msg;

    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside init() --";
    }

    public void start(){
        msg += " Inside start() --";
    }

    public void paint(Graphics g) {
        msg += " Inside paint().";
        g.drawString(msg, 10, 30);
    }
}
