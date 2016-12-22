package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by denba on 08.12.2016.
 */
public class MySwingApplet extends JApplet {
    JButton jButtonAlpha;
    JButton jButtonBeta;

    JLabel jLabel;

    public void init(){
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    private void makeGUI(){
        setLayout(new FlowLayout());

        jButtonAlpha = new JButton("Alpha");
        jButtonBeta = new JButton("Beta");

        jButtonAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Alpha was pressed.");
            }
        });

        jButtonBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Beta was pressed.");
            }
        });

        add(jButtonAlpha);
        add(jButtonBeta);
        jLabel = new JLabel("Press a button");
        add(jLabel);
    }
}
