package applets;

import java.awt.*;
import java.applet.*;
/**
 * Created by denba on 27.11.2016.
 * <applet code="StatusWindow" width=300 height=50></applet>
 */
public class StatusWindow extends Applet{
    public void init()
    {
        setBackground(Color.cyan);
    }

    public void paint(Graphics g)
    {
        g.drawString("This is in the applet window", 10, 20);

        showStatus("This is show in the status window.");
    }


}
