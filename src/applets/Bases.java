package applets;

import java.applet.*;
import java.awt.*;
import java.net.*;

/**
 * Created by denba on 27.11.2016.
 */
public class Bases extends Applet {
    public void paint(Graphics g)
    {
        String msg;
        URL url = getCodeBase();
        msg = "Code base: " + url.toString();
        g.drawString(msg, 10, 20);
        url = getDocumentBase();
        msg = "Document base: " + url.toString();
        g.drawString(msg, 10,40);
    }
}
