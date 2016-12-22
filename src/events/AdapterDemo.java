package events;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/**
 * Created by denba on 28.11.2016.
 */
public class AdapterDemo extends Applet {
    public void init(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}

class MyMouseAdapter extends MouseAdapter{
    AdapterDemo adapterDemo;

    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        adapterDemo.showStatus("Mouse clicked");
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter
{
    AdapterDemo adapterDemo;

    public MyMouseMotionAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        adapterDemo.showStatus("Mouse dragged");
    }
}
