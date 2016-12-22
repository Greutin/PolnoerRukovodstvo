package awtlearning;

/**
 * Created by denba on 28.11.2016.
 */
/*public class AppWindow extends Frame {
    String keymsg = "This is a test.";
    String mousemsg = "";
    int mouseX = 30, mouseY = 30;

    public AppWindow()
    {
        addKeyListener(new MyKeyAdapter(this));
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g)
    {
        g.drawString(keymsg, 10,40);
        g.drawString(mousemsg, mouseX, mouseY);
    }

    public static void main(String args[])
    {
        AppWindow appwin = new AppWindow();
        appwin.setSize(new Dimension(300, 200));
        appwin.setTitle("An AWT-Base Application");
        appwin.setVisible(true);
    }
}

class MyKeyAdapter extends KeyAdapter
{
    AppWindow appWindow;

    public MyKeyAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void keyTyped(KeyEvent e){
        appWindow.keymsg +=e.getKeyChar();
        appWindow.repaint();
    }
}

class MyMouseAdapter extends MouseAdapter
{
    AppWindow appWindow;

    public MyMouseAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void mousePressed(MouseEvent e)
    {
        appWindow.mouseX = e.getX();
        appWindow.mouseY = e.getY();
        appWindow.mousemsg = "Mouse Down at " + appWindow.mouseX + ", " + appWindow.mouseY;
        appWindow.repaint();
    }
}

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}*/