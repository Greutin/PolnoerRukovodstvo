package applets;

import java.awt.*;
import java.applet.*;

/**
 * Created by denba on 27.11.2016.
 * <applet code="Banner" width=300 height=200>
 *     <param name=message value="Java makes the Web move!"
 *     </applet>
 */
public class Banner extends Applet implements Runnable{
    String msg;
    Thread t = null;
    int state;
    volatile boolean stopFlag;

    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void start()
    {
        msg = getParameter("message");
        if(msg == null) msg = "Message not found";
        msg = " " + msg;
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    public void run()
    {
        for(;;)
        {
            try{
                repaint();
                Thread.sleep(250);
                if(stopFlag)
                    break;
            } catch(InterruptedException e) {}
        }
    }

    public void stop(){
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics g)
    {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
