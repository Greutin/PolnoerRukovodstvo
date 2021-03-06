package awtlearning.menu;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by denba on 08.12.2016.
 */

class SampleDialog extends Dialog implements ActionListener, WindowListener
{
    SampleDialog(Frame parent, String title)
    {
        super(parent, title, false);

        setLayout(new FlowLayout());
        setSize(300, 200);
        add(new Label("Press this button:"));
        Button b;
        add(b = new Button("Cancel"));
        b.addActionListener(this);
        addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public void paint(Graphics g)
    {
        g.drawString("This is in the dialog box", 10, 70);
    }
}

class MenuFrame extends Frame{
    String msg = "";
    CheckboxMenuItem debug, test;

    MenuFrame(String title)
    {
        super(title);

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);

        Menu file = new Menu("File");
        MenuItem item1, item2, item3, item4, item5;

        file.add(item1 = new MenuItem("New..."));
        file.add(item2 = new MenuItem("Open..."));
        file.add(item3 = new MenuItem("Close..."));
        file.add(item4 = new MenuItem("-"));
        file.add(item5 = new MenuItem("Quit..."));
        mbar.add(file);

        Menu edit = new Menu("Edit");
        MenuItem item6, item7, item8, item9;
        edit.add(item6 = new MenuItem("Cut"));
        edit.add(item7 = new MenuItem("Copy"));
        edit.add(item8 = new MenuItem("Paste"));
        edit.add(item9 = new MenuItem("-"));

        Menu sub = new Menu("Special");
        MenuItem item10, item11, item12;
        sub.add(item10 = new MenuItem("First"));
        sub.add(item11 = new MenuItem("Second"));
        sub.add(item12 = new MenuItem("Third"));
        edit.add(sub);

        debug = new CheckboxMenuItem("Debug");
        edit.add(debug);
        test = new CheckboxMenuItem("Testing");
        edit.add(test);

        mbar.add(edit);

        MyMenuHandler handler = new MyMenuHandler(this);
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
        item5.addActionListener(handler);
        item6.addActionListener(handler);
        item7.addActionListener(handler);
        item8.addActionListener(handler);
        item9.addActionListener(handler);
        item10.addActionListener(handler);
        item11.addActionListener(handler);
        item12.addActionListener(handler);
        debug.addItemListener(handler);
        test.addItemListener(handler);

        MyWindowAdapter adapter = new MyWindowAdapter(this);

        addWindowListener(adapter);
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, 10, 200);
        if(debug.getState())
            g.drawString("Debug is on.", 10, 220);
        else
            g.drawString("Debug is off.", 10, 220);

        if(test.getState())
            g.drawString("Testing is on.", 10, 240);
        else
            g.drawString("Testing is off.", 10, 240);
    }
}

class MyWindowAdapter extends WindowAdapter
{
    MenuFrame menuFrame;
    public MyWindowAdapter(MenuFrame menuFrame)
    {
        this.menuFrame = menuFrame;
    }

    public void windowClosing(WindowEvent e){
        menuFrame.setVisible(false);
    }
}

class MyMenuHandler implements ActionListener, ItemListener
{
    MenuFrame menuFrame;

    public MyMenuHandler(MenuFrame menuFrame) {
        this.menuFrame = menuFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String msg = "Tou selected ";
        String arg = e.getActionCommand();
        if(arg.equals("New..."))
        {
            msg += "New.";
            SampleDialog d = new SampleDialog(menuFrame, "New Dialog Box");
            d.setVisible(true);
        }
        // попытаться  определить  диалоговые  окна
        // для  остальных  пунктов  меню
        else  if(arg.equals ("Open..." ))
            msg  +=  "Open.";
        else  if(arg. equals( "Close") )
            msg  +=  "Close.";
        else  if(arg. equals ("Quit..." ))
            msg  +=  "Quit.";
        else  if(arg.equals( "Edit") )
            msg  +=  "Edit .";
        else  if(arg. equals( "Cut") )
            msg  +=  "Cut .";
        else  if(arg. equals( "Copy"))
            msg  += "Сору.";  // Копирование
        else  if(arg.equals ( "Paste") )
            msg  +=  "Paste.";  //  Вставка
        else  if(arg.equals( "First"))
            msg  +=  "First.";  //  Первое  окно
        else  if(arg. equals("Second"))
            msg  +=  "Second.";  // Второе  окно
        else  if(arg. equals( "Third"))
            msg  +=  "Third."; // Третье  окно
        else  if(arg. equals( "Debug" ))
            msg  +=  "Debug .";  // Отладка
        else  if(arg.equals("Testing"))
            msg  +=  "Testing.";  // Тестирование
        menuFrame.msg = msg;
        menuFrame.repaint();
}

    @Override
    public void itemStateChanged(ItemEvent e) {
        menuFrame.repaint();
    }
}
public class MenuDemo extends Applet implements ActionListener {
    Frame f;

    @Override
    public void actionPerformed(ActionEvent e) {
        f.setVisible(true);
    }

    public void init(){
        f = new MenuFrame("Menu Demo");
        int width = Integer.parseInt(getParameter("width"));
        int height = Integer.parseInt(getParameter("height"));

        setSize(new Dimension(width, height));

        f.setSize(width, height);

        Button openFrame = new Button("Open frame");
        add(openFrame);
        openFrame.addActionListener(this);
    }
    public void stop(){
        f.setVisible(false);
    }
}
