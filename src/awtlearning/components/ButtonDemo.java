package awtlearning.components;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by denba on 07.12.2016.
 */
public class ButtonDemo extends Applet implements ActionListener{
    String msg = "";
    Button yes, no, maybe;

    public void init(){
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Undecided");

        add(yes);
        add(no);
        add(maybe);

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        switch (str)
        {
            case "Yes":
                msg = "You pressed Yes.";
                break;
            case "No":
                msg = "You pressed No.";
                break;
            case "Undecided":
                msg = "You pressed Undecided.";
                break;
        }
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg, 6, 100);
    }
}
