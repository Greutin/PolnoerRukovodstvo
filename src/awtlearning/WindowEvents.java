package awtlearning;

/**
 * Created by denba on 28.11.2016.
 */

/*class SampleFrame extends Frame implements MouseListener, MouseMotionListener{
    String msg = "";
    int mouseX = 10, mouseY = 40,
        movX = 0, movY = 0;

    SampleFrame(String title){
        super(title);

        addMouseListener(this);
        addMouseMotionListener(this);

        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }

    public void mouseClicked (MouseEvent e)
    {}

    public void mouseEntered(MouseEvent e)
    {
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse just entered child.";
        repaint();
    }

    public void mouseExited(MouseEvent e)
    {
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse just left child wndow.";
        repaint();
    }

    public void mousePressed(MouseEvent e)
    {
        mouseY = e.getY();
        mouseX = e.getX();
        msg = "Down";
        repaint();
    }

    public void mouseReleased (MouseEvent e)
    {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Up";
        repaint();
    }

    public void mouseDragged(MouseEvent e){
        mouseY = e.getY();
        mouseX = e.getX();
        movX = e.getX();
        movY = e.getY();
        msg = "*";
        repaint();
    }

    public void mouseMoved(MouseEvent e){
        movY = e.getY();
        movX = e.getX();
        repaint(0, 0, 100, 60);
    }

    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Mouse at " + movX + ", " + movY, 10, 40);
    }
}

class MyWindowAdapter extends WindowAdapter
{
    SampleFrame sampleFrame;
    public MyWindowAdapter(SampleFrame sampleFrame)
    {
        this.sampleFrame = sampleFrame;
    }

    public void windowClosing(WindowEvent e)
    {
        sampleFrame.setVisible(false);
    }
}

public class WindowEvents extends Applet implements MouseListener, MouseMotionListener {
    SampleFrame f;
    String msg = "";
    int mouseX = 0, mouseY = 10,
        movX = 0, movY = 0;

    public void init()
    {
        f = new SampleFrame("Handle Mouse Events");
        f.setSize(300, 200);
        f.setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void start()
    {
        f.setVisible(true);
    }

    public void stop()
    {
        f.setVisible(false);
    }

    public void mouseClicked(MouseEvent e)
    {

    }

    public void mouseEntered(MouseEvent e)
    {
        mouseX = 0;
        mouseY = 24;
        msg = "Mouse just entered applet window.";
        repaint();
    }

    public void mouseExited(MouseEvent e)
    {
        mouseX = 0;
        mouseY = 24;
        msg = "Mouse just left applet window.";
        repaint();
    }

    public void mousePressed(MouseEvent e)
    {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Down";
        repaint();
    }

    public void mouseReleased(MouseEvent e)
    {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Up";
        repaint();
    }

    public void mouseDragged(MouseEvent e)
    {
        mouseX = e.getX();
        mouseY = e.getY();
        movX = e.getX();
        movY = e.getY();
        msg = "*";
        repaint();
    }

    public void mouseMoved(MouseEvent e)
    {
        movX = e.getX();
        movY = e.getY();
        repaint(0, 0, 100, 20);
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Mouse at " + movX + ", " + movY, 0, 10);
    }
}
*/