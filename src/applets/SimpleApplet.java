package applets;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Denis on 30.10.2016.
 */
/*
* <applet code="SimpleApplet" width=200 height=80></applet>
* */
public class SimpleApplet extends Applet {
    public void paint(Graphics g)
    {
        g.drawString("Простейший аплет", 20, 20);
    }
}
